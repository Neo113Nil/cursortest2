package com.chartboost.sdk.impl;

import androidx.media3.exoplayer.ExoPlayer;
import java.net.URL;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public abstract class we {

    public static final class a extends we {
        public final Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.a = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.a + ")";
        }
    }

    public ExoPlayer a() {
        return null;
    }

    public we() {
    }

    public /* synthetic */ we(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class b extends we {
        public static final b a = new b();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 109869544;
        }

        public String toString() {
            return "Idle";
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends we {
        public final URL a;
        public final ExoPlayer b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(URL url, ExoPlayer player) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(player, "player");
            this.a = url;
            this.b = player;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.a, cVar.a) && Intrinsics.areEqual(this.b, cVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Loading(url=" + this.a + ", player=" + this.b + ")";
        }

        public final URL b() {
            return this.a;
        }

        @Override // com.chartboost.sdk.impl.we
        public ExoPlayer a() {
            return this.b;
        }
    }

    public static final class f extends we {
        public final URL a;
        public final ExoPlayer b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(URL url, ExoPlayer player) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(player, "player");
            this.a = url;
            this.b = player;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Intrinsics.areEqual(this.a, fVar.a) && Intrinsics.areEqual(this.b, fVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Ready(url=" + this.a + ", player=" + this.b + ")";
        }

        public final URL b() {
            return this.a;
        }

        @Override // com.chartboost.sdk.impl.we
        public ExoPlayer a() {
            return this.b;
        }
    }

    public static final class e extends we {
        public final URL a;
        public final ExoPlayer b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(URL url, ExoPlayer player) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(player, "player");
            this.a = url;
            this.b = player;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.areEqual(this.a, eVar.a) && Intrinsics.areEqual(this.b, eVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Playing(url=" + this.a + ", player=" + this.b + ")";
        }

        public final URL b() {
            return this.a;
        }

        @Override // com.chartboost.sdk.impl.we
        public ExoPlayer a() {
            return this.b;
        }
    }

    public static final class d extends we {
        public final URL a;
        public final ExoPlayer b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(URL url, ExoPlayer player) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(player, "player");
            this.a = url;
            this.b = player;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.a, dVar.a) && Intrinsics.areEqual(this.b, dVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Paused(url=" + this.a + ", player=" + this.b + ")";
        }

        public final URL b() {
            return this.a;
        }

        @Override // com.chartboost.sdk.impl.we
        public ExoPlayer a() {
            return this.b;
        }
    }

    public static final class h extends we {
        public final URL a;
        public final ExoPlayer b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(URL url, ExoPlayer player) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(player, "player");
            this.a = url;
            this.b = player;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Intrinsics.areEqual(this.a, hVar.a) && Intrinsics.areEqual(this.b, hVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Stopped(url=" + this.a + ", player=" + this.b + ")";
        }

        public final URL b() {
            return this.a;
        }

        @Override // com.chartboost.sdk.impl.we
        public ExoPlayer a() {
            return this.b;
        }
    }

    public static final class g extends we {
        public static final g a = new g();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public int hashCode() {
            return 1919674705;
        }

        public String toString() {
            return "Released";
        }

        public g() {
            super(null);
        }
    }
}
