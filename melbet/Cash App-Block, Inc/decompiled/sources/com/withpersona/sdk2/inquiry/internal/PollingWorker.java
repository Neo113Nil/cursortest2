package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.device.RealDeviceIdProvider;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager;
import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper;
import com.withpersona.sdk2.inquiry.internal.network.InquiryService;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags;
import com.withpersona.sdk2.inquiry.shared.inquiryTheme.InquiryThemeManager;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.FontDownloader;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;

/* loaded from: classes9.dex */
public final class PollingWorker implements WorkflowWorker {
    public final boolean canReuseWorkflow;
    public final RealDeviceIdProvider deviceIdProvider;
    public final RealFallbackModeManager fallbackModeManager;
    public final FontDownloader fontDownloader;
    public final InquiryApiHelper inquiryApiHelper;
    public final String inquiryId;
    public InquirySessionConfig inquirySessionConfig;
    public final PollingMode pollingMode;
    public final SandboxFlags sandboxFlags;
    public final InquiryService service;
    public final String sessionToken;
    public final InquiryThemeManager themeManager;

    public abstract class Response {

        public final class Error extends Response {
            public final InternalErrorInfo.NetworkErrorInfo cause;

            public Error(InternalErrorInfo.NetworkErrorInfo networkErrorInfo) {
                this.cause = networkErrorInfo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && this.cause.equals(((Error) obj).cause);
            }

            public final int hashCode() {
                return this.cause.hashCode();
            }

            public final String toString() {
                return "Error(cause=" + this.cause + ")";
            }
        }

        public final class Success extends Response {
            public final InquiryState nextState;

            public Success(InquiryState inquiryState) {
                this.nextState = inquiryState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && this.nextState.equals(((Success) obj).nextState);
            }

            public final int hashCode() {
                return this.nextState.hashCode();
            }

            public final String toString() {
                return "Success(nextState=" + this.nextState + ")";
            }
        }
    }

    public PollingWorker(String str, String str2, PollingMode pollingMode, InquirySessionConfig inquirySessionConfig, boolean z, InquiryService inquiryService, RealDeviceIdProvider realDeviceIdProvider, SandboxFlags sandboxFlags, RealFallbackModeManager realFallbackModeManager, FontDownloader fontDownloader, InquiryThemeManager inquiryThemeManager, InquiryApiHelper inquiryApiHelper) {
        pollingMode.getClass();
        inquirySessionConfig.getClass();
        inquiryService.getClass();
        realDeviceIdProvider.getClass();
        sandboxFlags.getClass();
        realFallbackModeManager.getClass();
        fontDownloader.getClass();
        inquiryThemeManager.getClass();
        inquiryApiHelper.getClass();
        this.sessionToken = str;
        this.inquiryId = str2;
        this.pollingMode = pollingMode;
        this.inquirySessionConfig = inquirySessionConfig;
        this.canReuseWorkflow = z;
        this.service = inquiryService;
        this.deviceIdProvider = realDeviceIdProvider;
        this.sandboxFlags = sandboxFlags;
        this.fallbackModeManager = realFallbackModeManager;
        this.fontDownloader = fontDownloader;
        this.themeManager = inquiryThemeManager;
        this.inquiryApiHelper = inquiryApiHelper;
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        if (!(workflowWorker instanceof PollingWorker)) {
            return false;
        }
        PollingWorker pollingWorker = (PollingWorker) workflowWorker;
        return this.sessionToken.equals(pollingWorker.sessionToken) && this.inquiryId.equals(pollingWorker.inquiryId) && this.pollingMode == pollingWorker.pollingMode;
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final Flow run() {
        return new SafeFlow(new PollingWorker$run$1(this, null));
    }
}
