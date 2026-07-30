package com.onesignal.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class e {

    public static final class a extends e {
        public static final a INSTANCE = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends e {
        private final K2.c logLevel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(K2.c logLevel) {
            super(null);
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            this.logLevel = logLevel;
        }

        public static /* synthetic */ b copy$default(b bVar, K2.c cVar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                cVar = bVar.logLevel;
            }
            return bVar.copy(cVar);
        }

        public final K2.c component1() {
            return this.logLevel;
        }

        public final b copy(K2.c logLevel) {
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            return new b(logLevel);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.logLevel == ((b) obj).logLevel;
        }

        public final K2.c getLogLevel() {
            return this.logLevel;
        }

        public int hashCode() {
            return this.logLevel.hashCode();
        }

        public String toString() {
            return "Enable(logLevel=" + this.logLevel + ')';
        }
    }

    public static final class c extends e {
        public static final c INSTANCE = new c();

        private c() {
            super(null);
        }
    }

    public static final class d extends e {
        private final K2.c newLevel;
        private final K2.c oldLevel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(K2.c oldLevel, K2.c newLevel) {
            super(null);
            Intrinsics.checkNotNullParameter(oldLevel, "oldLevel");
            Intrinsics.checkNotNullParameter(newLevel, "newLevel");
            this.oldLevel = oldLevel;
            this.newLevel = newLevel;
        }

        public static /* synthetic */ d copy$default(d dVar, K2.c cVar, K2.c cVar2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                cVar = dVar.oldLevel;
            }
            if ((i2 & 2) != 0) {
                cVar2 = dVar.newLevel;
            }
            return dVar.copy(cVar, cVar2);
        }

        public final K2.c component1() {
            return this.oldLevel;
        }

        public final K2.c component2() {
            return this.newLevel;
        }

        public final d copy(K2.c oldLevel, K2.c newLevel) {
            Intrinsics.checkNotNullParameter(oldLevel, "oldLevel");
            Intrinsics.checkNotNullParameter(newLevel, "newLevel");
            return new d(oldLevel, newLevel);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.oldLevel == dVar.oldLevel && this.newLevel == dVar.newLevel;
        }

        public final K2.c getNewLevel() {
            return this.newLevel;
        }

        public final K2.c getOldLevel() {
            return this.oldLevel;
        }

        public int hashCode() {
            return this.newLevel.hashCode() + (this.oldLevel.hashCode() * 31);
        }

        public String toString() {
            return "UpdateLogLevel(oldLevel=" + this.oldLevel + ", newLevel=" + this.newLevel + ')';
        }
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private e() {
    }
}
