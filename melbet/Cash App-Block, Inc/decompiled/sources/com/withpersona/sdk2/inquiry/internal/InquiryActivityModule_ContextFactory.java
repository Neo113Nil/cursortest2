package com.withpersona.sdk2.inquiry.internal;

import android.app.Application;
import android.content.Context;
import dagger.internal.Factory;
import okhttp3.FormBody;

/* loaded from: classes9.dex */
public final class InquiryActivityModule_ContextFactory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final FormBody.Builder module;

    public /* synthetic */ InquiryActivityModule_ContextFactory(FormBody.Builder builder, int i) {
        this.$r8$classId = i;
        this.module = builder;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        FormBody.Builder builder = this.module;
        switch (i) {
            case 0:
                Context context = (Context) builder.values;
                if (context != null) {
                    return context;
                }
                Context applicationContext = ((Application) builder.names).getApplicationContext();
                applicationContext.getClass();
                return applicationContext;
            default:
                Application application = (Application) builder.names;
                application.getClass();
                return application;
        }
    }
}
