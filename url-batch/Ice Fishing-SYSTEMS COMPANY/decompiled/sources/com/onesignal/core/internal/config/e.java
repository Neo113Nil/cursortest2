package com.onesignal.core.internal.config;

import com.onesignal.common.modeling.i;

/* loaded from: classes2.dex */
public final class e extends i {
    public static final a Companion = new a(null);
    public static final int DEFAULT_INDIRECT_ATTRIBUTION_WINDOW = 1440;
    public static final int DEFAULT_NOTIFICATION_LIMIT = 10;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends kotlin.jvm.internal.i implements E7.a {
        public static final b INSTANCE = new b();

        public b() {
            super(0);
        }

        @Override // E7.a
        public final Integer invoke() {
            return 10;
        }
    }

    public static final class c extends kotlin.jvm.internal.i implements E7.a {
        public static final c INSTANCE = new c();

        public c() {
            super(0);
        }

        @Override // E7.a
        public final Integer invoke() {
            return Integer.valueOf(e.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW);
        }
    }

    public static final class d extends kotlin.jvm.internal.i implements E7.a {
        public static final d INSTANCE = new d();

        public d() {
            super(0);
        }

        @Override // E7.a
        public final Integer invoke() {
            return Integer.valueOf(e.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW);
        }
    }

    /* renamed from: com.onesignal.core.internal.config.e$e, reason: collision with other inner class name */
    public static final class C0186e extends kotlin.jvm.internal.i implements E7.a {
        public static final C0186e INSTANCE = new C0186e();

        public C0186e() {
            super(0);
        }

        @Override // E7.a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class f extends kotlin.jvm.internal.i implements E7.a {
        public static final f INSTANCE = new f();

        public f() {
            super(0);
        }

        @Override // E7.a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class g extends kotlin.jvm.internal.i implements E7.a {
        public static final g INSTANCE = new g();

        public g() {
            super(0);
        }

        @Override // E7.a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class h extends kotlin.jvm.internal.i implements E7.a {
        public static final h INSTANCE = new h();

        public h() {
            super(0);
        }

        @Override // E7.a
        public final Integer invoke() {
            return 10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i parentModel, String parentProperty) {
        super(parentModel, parentProperty);
        kotlin.jvm.internal.h.e(parentModel, "parentModel");
        kotlin.jvm.internal.h.e(parentProperty, "parentProperty");
    }

    public final int getIamLimit() {
        return getIntProperty("iamLimit", b.INSTANCE);
    }

    public final int getIndirectIAMAttributionWindow() {
        return getIntProperty("indirectIAMAttributionWindow", c.INSTANCE);
    }

    public final int getIndirectNotificationAttributionWindow() {
        return getIntProperty("indirectNotificationAttributionWindow", d.INSTANCE);
    }

    public final int getNotificationLimit() {
        return getIntProperty("notificationLimit", h.INSTANCE);
    }

    public final boolean isDirectEnabled() {
        return getBooleanProperty("isDirectEnabled", C0186e.INSTANCE);
    }

    public final boolean isIndirectEnabled() {
        return getBooleanProperty("isIndirectEnabled", f.INSTANCE);
    }

    public final boolean isUnattributedEnabled() {
        return getBooleanProperty("isUnattributedEnabled", g.INSTANCE);
    }

    public final void setDirectEnabled(boolean z8) {
        i.setBooleanProperty$default(this, "isDirectEnabled", z8, null, false, 12, null);
    }

    public final void setIamLimit(int i) {
        i.setIntProperty$default(this, "iamLimit", i, null, false, 12, null);
    }

    public final void setIndirectEnabled(boolean z8) {
        i.setBooleanProperty$default(this, "isIndirectEnabled", z8, null, false, 12, null);
    }

    public final void setIndirectIAMAttributionWindow(int i) {
        i.setIntProperty$default(this, "indirectIAMAttributionWindow", i, null, false, 12, null);
    }

    public final void setIndirectNotificationAttributionWindow(int i) {
        i.setIntProperty$default(this, "indirectNotificationAttributionWindow", i, null, false, 12, null);
    }

    public final void setNotificationLimit(int i) {
        i.setIntProperty$default(this, "notificationLimit", i, null, false, 12, null);
    }

    public final void setUnattributedEnabled(boolean z8) {
        i.setBooleanProperty$default(this, "isUnattributedEnabled", z8, null, false, 12, null);
    }
}
