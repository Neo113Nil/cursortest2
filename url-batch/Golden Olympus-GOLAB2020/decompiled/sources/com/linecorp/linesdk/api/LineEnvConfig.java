package com.linecorp.linesdk.api;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class LineEnvConfig {

    @NotNull
    private final String apiServerBaseUri = "https://api.line.me/";

    @NotNull
    private final String openIdDiscoveryDocumentUrl = "https://access.line.me/.well-known/openid-configuration";

    @NotNull
    private final String webLoginPageUrl = "https://access.line.me/oauth2/v2.1/login";

    @NotNull
    public String getApiServerBaseUri() {
        return this.apiServerBaseUri;
    }

    @NotNull
    public String getOpenIdDiscoveryDocumentUrl() {
        return this.openIdDiscoveryDocumentUrl;
    }

    @NotNull
    public String getWebLoginPageUrl() {
        return this.webLoginPageUrl;
    }
}
