package com.chartboost.sdk.impl;

import android.content.Context;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import java.io.File;
import java.net.URL;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public abstract class ue {

    public static final class l extends ue {
        public final nh a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(nh reason) {
            super(null);
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.a = reason;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.a == ((l) obj).a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Stop(reason=" + this.a + ")";
        }
    }

    public ue() {
    }

    public static final class a extends ue {
        public final Context a;
        public final URL b;
        public final b7 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, URL url, b7 cache) {
            super(null);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(cache, "cache");
            this.a = context;
            this.b = url;
            this.c = cache;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "Load(context=" + this.a + ", url=" + this.b + ", cache=" + this.c + ")";
        }

        public final Context b() {
            return this.a;
        }

        public final URL c() {
            return this.b;
        }

        public final b7 a() {
            return this.c;
        }
    }

    public /* synthetic */ ue(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class i extends ue {
        public static final i a = new i();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public int hashCode() {
            return 1322022111;
        }

        public String toString() {
            return "Play";
        }

        public i() {
            super(null);
        }
    }

    public static final class h extends ue {
        public static final h a = new h();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public int hashCode() {
            return -1967296085;
        }

        public String toString() {
            return "Pause";
        }

        public h() {
            super(null);
        }
    }

    public static final class j extends ue {
        public static final j a = new j();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public int hashCode() {
            return 1094867580;
        }

        public String toString() {
            return "Release";
        }

        public j() {
            super(null);
        }
    }

    public static final class k extends ue {
        public final float a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && Float.compare(this.a, ((k) obj).a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.a);
        }

        public String toString() {
            return "SetVolume(volume=" + this.a + ")";
        }

        public final float a() {
            return this.a;
        }

        public k(float f) {
            super(null);
            this.a = f;
        }
    }

    public static final class g extends ue {
        public final ExoPlayer a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ExoPlayer player) {
            super(null);
            Intrinsics.checkNotNullParameter(player, "player");
            this.a = player;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Intrinsics.areEqual(this.a, ((g) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "OnPlayerReady(player=" + this.a + ")";
        }

        public final ExoPlayer a() {
            return this.a;
        }
    }

    public static final class e extends ue {
        public static final e a = new e();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 1259040565;
        }

        public String toString() {
            return "OnPlaybackEnded";
        }

        public e() {
            super(null);
        }
    }

    public static final class f extends ue {
        public final PlaybackException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(PlaybackException error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.a = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.areEqual(this.a, ((f) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "OnPlayerError(error=" + this.a + ")";
        }

        public final PlaybackException a() {
            return this.a;
        }
    }

    public static final class d extends ue {
        public final Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.a = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.a, ((d) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "OnFailed(error=" + this.a + ")";
        }

        public final Throwable a() {
            return this.a;
        }
    }

    public static final class b extends ue {
        public final File a;
        public final ExoPlayer b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(File file, ExoPlayer player) {
            super(null);
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(player, "player");
            this.a = file;
            this.b = player;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.a, bVar.a) && Intrinsics.areEqual(this.b, bVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "OnAssetCached(file=" + this.a + ", player=" + this.b + ")";
        }

        public final File a() {
            return this.a;
        }

        public final ExoPlayer b() {
            return this.b;
        }
    }

    public static final class c extends ue {
        public static final c a = new c();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 2063644930;
        }

        public String toString() {
            return "OnAssetEvicted";
        }

        public c() {
            super(null);
        }
    }
}
