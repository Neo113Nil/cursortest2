package androidx.media2.session;

import androidx.media.d;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaParcelUtils;
import androidx.media2.common.ParcelImplListSlice;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final d.e f1227a = new d.e("androidx.media2.session.MediaLibraryService", null);

    /* renamed from: b, reason: collision with root package name */
    public static final Executor f1228b = new a();

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, String> f1229c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, String> f1230d;

    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f1229c = hashMap;
        f1230d = new HashMap();
        hashMap.put("android.media.metadata.ADVERTISEMENT", "androidx.media2.metadata.ADVERTISEMENT");
        hashMap.put("android.media.metadata.BT_FOLDER_TYPE", "androidx.media2.metadata.BROWSABLE");
        hashMap.put("android.media.metadata.DOWNLOAD_STATUS", "androidx.media2.metadata.DOWNLOAD_STATUS");
        for (Map.Entry entry : hashMap.entrySet()) {
            Map<String, String> map = f1230d;
            if (map.containsKey(entry.getValue())) {
                throw new RuntimeException("Shouldn't map to the same value");
            }
            map.put((String) entry.getValue(), (String) entry.getKey());
        }
    }

    public static ParcelImplListSlice a(List<MediaItem> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            MediaItem mediaItem = list.get(i7);
            if (mediaItem != null) {
                arrayList.add(MediaParcelUtils.b(mediaItem));
            }
        }
        return new ParcelImplListSlice(arrayList);
    }

    public static List<MediaItem> b(ParcelImplListSlice parcelImplListSlice) {
        if (parcelImplListSlice == null) {
            return null;
        }
        List<ParcelImpl> a7 = parcelImplListSlice.a();
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < a7.size(); i7++) {
            ParcelImpl parcelImpl = a7.get(i7);
            if (parcelImpl != null) {
                arrayList.add((MediaItem) MediaParcelUtils.a(parcelImpl));
            }
        }
        return arrayList;
    }

    public static MediaItem c(MediaItem mediaItem) {
        return (mediaItem == null || mediaItem.getClass() == MediaItem.class) ? mediaItem : new MediaItem.a().d(mediaItem.h()).b(mediaItem.e()).c(mediaItem.g()).a();
    }
}
