package com.onesignal.core.internal.config;

import com.onesignal.common.modeling.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends i {
    public static final a Companion = new a(null);
    public static final int DEFAULT_INDIRECT_ATTRIBUTION_WINDOW = 1440;
    public static final int DEFAULT_NOTIFICATION_LIMIT = 10;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends p implements Function0 {
        public static final b INSTANCE = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return 10;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends p implements Function0 {
        public static final c INSTANCE = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(d.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.core.internal.config.d$d, reason: collision with other inner class name */
    public static final class C0015d extends p implements Function0 {
        public static final C0015d INSTANCE = new C0015d();

        public C0015d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(d.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class h extends p implements Function0 {
        public static final h INSTANCE = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return 10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, String str) {
        super(iVar, str);
        iVar.getClass();
        str.getClass();
    }

    public final int getIamLimit() {
        return getIntProperty("iamLimit", b.INSTANCE);
    }

    public final int getIndirectIAMAttributionWindow() {
        return getIntProperty("indirectIAMAttributionWindow", c.INSTANCE);
    }

    public final int getIndirectNotificationAttributionWindow() {
        return getIntProperty("indirectNotificationAttributionWindow", C0015d.INSTANCE);
    }

    public final int getNotificationLimit() {
        return getIntProperty("notificationLimit", h.INSTANCE);
    }

    public final boolean isDirectEnabled() {
        return getBooleanProperty("isDirectEnabled", e.INSTANCE);
    }

    public final boolean isIndirectEnabled() {
        return getBooleanProperty("isIndirectEnabled", f.INSTANCE);
    }

    public final boolean isUnattributedEnabled() {
        return getBooleanProperty("isUnattributedEnabled", g.INSTANCE);
    }

    public final void setDirectEnabled(boolean z10) {
        i.setBooleanProperty$default(this, "isDirectEnabled", z10, null, false, 12, null);
    }

    public final void setIamLimit(int i3) {
        i.setIntProperty$default(this, "iamLimit", i3, null, false, 12, null);
    }

    public final void setIndirectEnabled(boolean z10) {
        i.setBooleanProperty$default(this, "isIndirectEnabled", z10, null, false, 12, null);
    }

    public final void setIndirectIAMAttributionWindow(int i3) {
        i.setIntProperty$default(this, "indirectIAMAttributionWindow", i3, null, false, 12, null);
    }

    public final void setIndirectNotificationAttributionWindow(int i3) {
        i.setIntProperty$default(this, "indirectNotificationAttributionWindow", i3, null, false, 12, null);
    }

    public final void setNotificationLimit(int i3) {
        i.setIntProperty$default(this, "notificationLimit", i3, null, false, 12, null);
    }

    public final void setUnattributedEnabled(boolean z10) {
        i.setBooleanProperty$default(this, "isUnattributedEnabled", z10, null, false, 12, null);
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class e extends p implements Function0 {
        public static final e INSTANCE = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class f extends p implements Function0 {
        public static final f INSTANCE = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class g extends p implements Function0 {
        public static final g INSTANCE = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }
}
