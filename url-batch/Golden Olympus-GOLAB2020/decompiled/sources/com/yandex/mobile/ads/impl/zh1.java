package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.view.TextureView;
import com.yandex.mobile.ads.impl.InterfaceC2259tl;
import com.yandex.mobile.ads.impl.qb0;
import com.yandex.mobile.ads.impl.zh1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public interface zh1 {

    public static final class a implements InterfaceC2259tl {

        /* renamed from: c, reason: collision with root package name */
        public static final a f35593c = new a(new qb0.a().a());

        /* renamed from: b, reason: collision with root package name */
        private final qb0 f35594b;

        /* renamed from: com.yandex.mobile.ads.impl.zh1$a$a, reason: collision with other inner class name */
        public static final class C0208a {

            /* renamed from: a, reason: collision with root package name */
            private final qb0.a f35595a = new qb0.a();

            public final C0208a a(int i4) {
                this.f35595a.a(i4);
                return this;
            }

            public final C0208a a(a aVar) {
                this.f35595a.a(aVar.f35594b);
                return this;
            }

            public final C0208a a(int... iArr) {
                qb0.a aVar = this.f35595a;
                aVar.getClass();
                for (int i4 : iArr) {
                    aVar.a(i4);
                }
                return this;
            }

            public final C0208a a(boolean z4, int i4) {
                qb0.a aVar = this.f35595a;
                if (z4) {
                    aVar.a(i4);
                    return this;
                }
                aVar.getClass();
                return this;
            }

            public final a a() {
                return new a(this.f35595a.a());
            }
        }

        static {
            new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.Hm
                @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
                public final InterfaceC2259tl fromBundle(Bundle bundle) {
                    zh1.a a4;
                    a4 = zh1.a.a(bundle);
                    return a4;
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a a(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(Integer.toString(0, 36));
            if (integerArrayList == null) {
                return f35593c;
            }
            qb0.a aVar = new qb0.a();
            for (int i4 = 0; i4 < integerArrayList.size(); i4++) {
                aVar.a(integerArrayList.get(i4).intValue());
            }
            return new a(aVar.a());
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.f35594b.equals(((a) obj).f35594b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f35594b.hashCode();
        }

        private a(qb0 qb0Var) {
            this.f35594b = qb0Var;
        }
    }

    public interface b {
        default void a(int i4) {
        }

        default void b(c60 c60Var) {
        }

        @Deprecated
        default void onCues(List<uu> list) {
        }

        default void onIsLoadingChanged(boolean z4) {
        }

        default void onIsPlayingChanged(boolean z4) {
        }

        default void onPlayWhenReadyChanged(boolean z4, int i4) {
        }

        default void onPlaybackStateChanged(int i4) {
        }

        default void onPlaybackSuppressionReasonChanged(int i4) {
        }

        @Deprecated
        default void onPlayerStateChanged(boolean z4, int i4) {
        }

        default void onRenderedFirstFrame() {
        }

        default void onSkipSilenceEnabledChanged(boolean z4) {
        }

        default void onSurfaceSizeChanged(int i4, int i5) {
        }

        default void onVolumeChanged(float f4) {
        }

        default void a(c60 c60Var) {
        }

        default void a(q62 q62Var) {
        }

        default void a(rf2 rf2Var) {
        }

        default void a(rv0 rv0Var, int i4) {
        }

        default void a(th1 th1Var) {
        }

        default void a(uv0 uv0Var) {
        }

        default void a(wu wuVar) {
        }

        default void a(wz0 wz0Var) {
        }

        default void a(x00 x00Var) {
        }

        default void a(a aVar) {
        }

        default void a(c cVar, c cVar2, int i4) {
        }

        default void a(boolean z4, int i4) {
        }
    }

    public static final class c implements InterfaceC2259tl {

        /* renamed from: b, reason: collision with root package name */
        public final Object f35596b;

        /* renamed from: c, reason: collision with root package name */
        public final int f35597c;

        /* renamed from: d, reason: collision with root package name */
        public final rv0 f35598d;

        /* renamed from: e, reason: collision with root package name */
        public final Object f35599e;

        /* renamed from: f, reason: collision with root package name */
        public final int f35600f;

        /* renamed from: g, reason: collision with root package name */
        public final long f35601g;

        /* renamed from: h, reason: collision with root package name */
        public final long f35602h;

        /* renamed from: i, reason: collision with root package name */
        public final int f35603i;

        /* renamed from: j, reason: collision with root package name */
        public final int f35604j;

        static {
            new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.Im
                @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
                public final InterfaceC2259tl fromBundle(Bundle bundle) {
                    zh1.c a4;
                    a4 = zh1.c.a(bundle);
                    return a4;
                }
            };
        }

        public c(Object obj, int i4, rv0 rv0Var, Object obj2, int i5, long j4, long j5, int i6, int i7) {
            this.f35596b = obj;
            this.f35597c = i4;
            this.f35598d = rv0Var;
            this.f35599e = obj2;
            this.f35600f = i5;
            this.f35601g = j4;
            this.f35602h = j5;
            this.f35603i = i6;
            this.f35604j = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c a(Bundle bundle) {
            int i4 = bundle.getInt(Integer.toString(0, 36), -1);
            Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
            return new c(null, i4, bundle2 == null ? null : rv0.f31377h.fromBundle(bundle2), null, bundle.getInt(Integer.toString(2, 36), -1), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getLong(Integer.toString(4, 36), -9223372036854775807L), bundle.getInt(Integer.toString(5, 36), -1), bundle.getInt(Integer.toString(6, 36), -1));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (this.f35597c == cVar.f35597c && this.f35600f == cVar.f35600f && this.f35601g == cVar.f35601g && this.f35602h == cVar.f35602h && this.f35603i == cVar.f35603i && this.f35604j == cVar.f35604j && nd1.a(this.f35596b, cVar.f35596b) && nd1.a(this.f35599e, cVar.f35599e) && nd1.a(this.f35598d, cVar.f35598d)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f35596b, Integer.valueOf(this.f35597c), this.f35598d, this.f35599e, Integer.valueOf(this.f35600f), Long.valueOf(this.f35601g), Long.valueOf(this.f35602h), Integer.valueOf(this.f35603i), Integer.valueOf(this.f35604j)});
        }
    }

    c60 a();

    void a(b bVar);

    void b(b bVar);

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    int getCurrentMediaItemIndex();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    x42 getCurrentTimeline();

    q62 getCurrentTracks();

    long getDuration();

    boolean getPlayWhenReady();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    long getTotalBufferedDuration();

    float getVolume();

    boolean hasNextMediaItem();

    boolean hasPreviousMediaItem();

    boolean isCurrentMediaItemDynamic();

    boolean isCurrentMediaItemLive();

    boolean isCurrentMediaItemSeekable();

    boolean isPlayingAd();

    void prepare();

    void release();

    void setPlayWhenReady(boolean z4);

    void setVideoTextureView(TextureView textureView);

    void setVolume(float f4);

    void stop();
}
