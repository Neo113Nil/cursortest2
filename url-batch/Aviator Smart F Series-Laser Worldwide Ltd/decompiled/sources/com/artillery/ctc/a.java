package com.artillery.ctc;

import com.just.agentweb.DefaultWebClient;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f674a = new a();

    public final String a(String resourceName) {
        kotlin.jvm.internal.s.checkNotNullParameter(resourceName, "resourceName");
        return DefaultWebClient.HTTPS_SCHEME + resourceName + "-resource.services.ai.azure.com/api/projects/" + resourceName + "/threads";
    }

    public final String b(String tenantId) {
        kotlin.jvm.internal.s.checkNotNullParameter(tenantId, "tenantId");
        return "https://login.microsoftonline.com/" + tenantId + "/oauth2/token";
    }

    public final String c(String path) {
        StringBuilder sb;
        String str;
        kotlin.jvm.internal.s.checkNotNullParameter(path, "path");
        if (h.f791d.a().e()) {
            sb = new StringBuilder();
            str = "https://dev-gpt-aqdue3fzdtbnh9f0.eastus-01.azurewebsites.net/";
        } else {
            sb = new StringBuilder();
            str = "https://text2audio.azurewebsites.net/";
        }
        sb.append(str);
        sb.append(path);
        return sb.toString();
    }

    public final String a(String thread, String resourceName) {
        kotlin.jvm.internal.s.checkNotNullParameter(thread, "thread");
        kotlin.jvm.internal.s.checkNotNullParameter(resourceName, "resourceName");
        return DefaultWebClient.HTTPS_SCHEME + resourceName + "-resource.services.ai.azure.com/api/projects/" + resourceName + "/threads/" + thread + "/messages";
    }

    public final String b(String thread, String resourceName) {
        kotlin.jvm.internal.s.checkNotNullParameter(thread, "thread");
        kotlin.jvm.internal.s.checkNotNullParameter(resourceName, "resourceName");
        return DefaultWebClient.HTTPS_SCHEME + resourceName + "-resource.services.ai.azure.com/api/projects/" + resourceName + "/threads/" + thread + "/runs";
    }
}
