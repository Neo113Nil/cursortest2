package com.onesignal.core.internal.config;

import com.onesignal.common.modeling.i;
import kotlin.jvm.internal.j;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
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

    public static final class b extends j implements InterfaceC0732a {
        public static final b INSTANCE = new b();

        public b() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final Integer invoke() {
            return 10;
        }
    }

    public static final class c extends j implements InterfaceC0732a {
        public static final c INSTANCE = new c();

        public c() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final Integer invoke() {
            return Integer.valueOf(e.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW);
        }
    }

    public static final class d extends j implements InterfaceC0732a {
        public static final d INSTANCE = new d();

        public d() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final Integer invoke() {
            return Integer.valueOf(e.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW);
        }
    }

    /* renamed from: com.onesignal.core.internal.config.e$e, reason: collision with other inner class name */
    public static final class C0018e extends j implements InterfaceC0732a {
        public static final C0018e INSTANCE = new C0018e();

        public C0018e() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class f extends j implements InterfaceC0732a {
        public static final f INSTANCE = new f();

        public f() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class g extends j implements InterfaceC0732a {
        public static final g INSTANCE = new g();

        public g() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class h extends j implements InterfaceC0732a {
        public static final h INSTANCE = new h();

        public h() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final Integer invoke() {
            return 10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i parentModel, String parentProperty) {
        super(parentModel, parentProperty);
        kotlin.jvm.internal.i.e(parentModel, "parentModel");
        kotlin.jvm.internal.i.e(parentProperty, "parentProperty");
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
        return getBooleanProperty("isDirectEnabled", C0018e.INSTANCE);
    }

    public final boolean isIndirectEnabled() {
        return getBooleanProperty("isIndirectEnabled", f.INSTANCE);
    }

    public final boolean isUnattributedEnabled() {
        return getBooleanProperty("isUnattributedEnabled", g.INSTANCE);
    }

    public final void setDirectEnabled(boolean z5) {
        i.setBooleanProperty$default(this, "isDirectEnabled", z5, null, false, 12, null);
    }

    public final void setIamLimit(int i7) {
        i.setIntProperty$default(this, "iamLimit", i7, null, false, 12, null);
    }

    public final void setIndirectEnabled(boolean z5) {
        i.setBooleanProperty$default(this, "isIndirectEnabled", z5, null, false, 12, null);
    }

    public final void setIndirectIAMAttributionWindow(int i7) {
        i.setIntProperty$default(this, "indirectIAMAttributionWindow", i7, null, false, 12, null);
    }

    public final void setIndirectNotificationAttributionWindow(int i7) {
        i.setIntProperty$default(this, "indirectNotificationAttributionWindow", i7, null, false, 12, null);
    }

    public final void setNotificationLimit(int i7) {
        i.setIntProperty$default(this, "notificationLimit", i7, null, false, 12, null);
    }

    public final void setUnattributedEnabled(boolean z5) {
        i.setBooleanProperty$default(this, "isUnattributedEnabled", z5, null, false, 12, null);
    }
}
