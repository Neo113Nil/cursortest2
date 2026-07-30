package com.google.android.exoplayer2.source.dash.offline;

import androidx.annotation.Nullable;
import androidx.profileinstaller.c;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.offline.DownloadException;
import com.google.android.exoplayer2.offline.SegmentDownloader;
import com.google.android.exoplayer2.source.dash.BaseUrlExclusionList;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import com.google.android.exoplayer2.source.dash.DashUtil;
import com.google.android.exoplayer2.source.dash.DashWrappingSegmentIndex;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.BaseUrl;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.DashManifestParser;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.util.RunnableFutureTask;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

@Deprecated
/* loaded from: classes3.dex */
public final class DashDownloader extends SegmentDownloader<DashManifest> {
    private final BaseUrlExclusionList baseUrlExclusionList;

    public DashDownloader(MediaItem mediaItem, CacheDataSource.Factory factory) {
        this(mediaItem, factory, new c());
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void addSegmentsForAdaptationSet(DataSource dataSource, AdaptationSet adaptationSet, long j8, long j9, boolean z7, ArrayList<SegmentDownloader.Segment> arrayList) {
        DashSegmentIndex segmentIndex;
        String str;
        for (int i8 = 0; i8 < adaptationSet.representations.size(); i8++) {
            Representation representation = adaptationSet.representations.get(i8);
            try {
            } catch (IOException e8) {
                e = e8;
            }
            try {
                segmentIndex = getSegmentIndex(dataSource, adaptationSet.type, representation, z7);
            } catch (IOException e9) {
                e = e9;
                if (z7) {
                    throw e;
                }
            }
            if (segmentIndex != null) {
                long segmentCount = segmentIndex.getSegmentCount(j9);
                if (segmentCount == -1) {
                    throw new DownloadException("Unbounded segment index");
                }
                String str2 = ((BaseUrl) Util.castNonNull(this.baseUrlExclusionList.selectBaseUrl(representation.baseUrls))).url;
                RangedUri initializationUri = representation.getInitializationUri();
                if (initializationUri != null) {
                    str = str2;
                    arrayList.add(createSegment(representation, str2, j8, initializationUri));
                } else {
                    str = str2;
                }
                RangedUri indexUri = representation.getIndexUri();
                if (indexUri != null) {
                    arrayList.add(createSegment(representation, str, j8, indexUri));
                }
                long firstSegmentNum = segmentIndex.getFirstSegmentNum();
                long j10 = (firstSegmentNum + segmentCount) - 1;
                for (long j11 = firstSegmentNum; j11 <= j10; j11++) {
                    arrayList.add(createSegment(representation, str, j8 + segmentIndex.getTimeUs(j11), segmentIndex.getSegmentUrl(j11)));
                }
            } else {
                try {
                    throw new DownloadException("Missing segment index");
                } catch (IOException e10) {
                    e = e10;
                    if (z7) {
                    }
                }
            }
        }
    }

    private SegmentDownloader.Segment createSegment(Representation representation, String str, long j8, RangedUri rangedUri) {
        return new SegmentDownloader.Segment(j8, DashUtil.buildDataSpec(representation, str, rangedUri, 0, ImmutableMap.of()));
    }

    @Nullable
    private DashSegmentIndex getSegmentIndex(final DataSource dataSource, final int i8, final Representation representation, boolean z7) {
        DashSegmentIndex index = representation.getIndex();
        if (index != null) {
            return index;
        }
        ChunkIndex chunkIndex = (ChunkIndex) execute(new RunnableFutureTask<ChunkIndex, IOException>() { // from class: com.google.android.exoplayer2.source.dash.offline.DashDownloader.1
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.exoplayer2.util.RunnableFutureTask
            public ChunkIndex doWork() {
                return DashUtil.loadChunkIndex(dataSource, i8, representation);
            }
        }, z7);
        if (chunkIndex == null) {
            return null;
        }
        return new DashWrappingSegmentIndex(chunkIndex, representation.presentationTimeOffsetUs);
    }

    public DashDownloader(MediaItem mediaItem, CacheDataSource.Factory factory, Executor executor) {
        this(mediaItem, new DashManifestParser(), factory, executor, 20000L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.offline.SegmentDownloader
    public List<SegmentDownloader.Segment> getSegments(DataSource dataSource, DashManifest dashManifest, boolean z7) {
        ArrayList<SegmentDownloader.Segment> arrayList = new ArrayList<>();
        for (int i8 = 0; i8 < dashManifest.getPeriodCount(); i8++) {
            Period period = dashManifest.getPeriod(i8);
            long msToUs = Util.msToUs(period.startMs);
            long periodDurationUs = dashManifest.getPeriodDurationUs(i8);
            int i9 = 0;
            for (List<AdaptationSet> list = period.adaptationSets; i9 < list.size(); list = list) {
                addSegmentsForAdaptationSet(dataSource, list.get(i9), msToUs, periodDurationUs, z7, arrayList);
                i9++;
            }
        }
        return arrayList;
    }

    @Deprecated
    public DashDownloader(MediaItem mediaItem, ParsingLoadable.Parser<DashManifest> parser, CacheDataSource.Factory factory, Executor executor) {
        this(mediaItem, parser, factory, executor, 20000L);
    }

    public DashDownloader(MediaItem mediaItem, ParsingLoadable.Parser<DashManifest> parser, CacheDataSource.Factory factory, Executor executor, long j8) {
        super(mediaItem, parser, factory, executor, j8);
        this.baseUrlExclusionList = new BaseUrlExclusionList();
    }
}
