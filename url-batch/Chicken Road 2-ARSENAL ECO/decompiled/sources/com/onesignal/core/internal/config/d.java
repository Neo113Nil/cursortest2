package com.onesignal.core.internal.config;

import com.onesignal.common.modeling.i;
import kotlin.jvm.internal.j;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class d extends i {

    public static final class a extends j implements InterfaceC0732a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final String invoke() {
            return null;
        }
    }

    public static final class b extends j implements InterfaceC0732a {
        public static final b INSTANCE = new b();

        public b() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final String invoke() {
            return null;
        }
    }

    public static final class c extends j implements InterfaceC0732a {
        public static final c INSTANCE = new c();

        public c() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final String invoke() {
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i parentModel, String parentProperty) {
        super(parentModel, parentProperty);
        kotlin.jvm.internal.i.e(parentModel, "parentModel");
        kotlin.jvm.internal.i.e(parentProperty, "parentProperty");
    }

    public final String getApiKey() {
        return getOptStringProperty("apiKey", a.INSTANCE);
    }

    public final String getAppId() {
        return getOptStringProperty("appId", b.INSTANCE);
    }

    public final String getProjectId() {
        return getOptStringProperty("projectId", c.INSTANCE);
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
}
