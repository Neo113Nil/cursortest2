package com.onesignal.core.internal.config;

import com.onesignal.common.modeling.i;
import kotlin.jvm.functions.Function0;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c extends i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, String str) {
        super(iVar, str);
        iVar.getClass();
        str.getClass();
    }

    public final String getApiKey() {
        return getOptStringProperty("apiKey", a.INSTANCE);
    }

    public final String getAppId() {
        return getOptStringProperty("appId", b.INSTANCE);
    }

    public final String getProjectId() {
        return getOptStringProperty("projectId", C0014c.INSTANCE);
    }

    public final void setApiKey(String str) {
        i.setOptStringProperty$default(this, "apiKey", str, null, false, 12, null);
    }

    public final void setAppId(String str) {
        i.setOptStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    public final void setProjectId(String str) {
        i.setOptStringProperty$default(this, "projectId", str, null, false, 12, null);
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends p implements Function0 {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return null;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends p implements Function0 {
        public static final b INSTANCE = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return null;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.core.internal.config.c$c, reason: collision with other inner class name */
    public static final class C0014c extends p implements Function0 {
        public static final C0014c INSTANCE = new C0014c();

        public C0014c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return null;
        }
    }
}
