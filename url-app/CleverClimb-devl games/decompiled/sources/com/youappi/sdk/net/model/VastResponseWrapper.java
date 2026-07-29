package com.youappi.sdk.net.model;

import com.a.a.a.b;
import com.a.a.a.d;
import com.a.a.a.f;
import com.youappi.sdk.YAErrorCode;
import com.youappi.sdk.logic.IAdEventListener;
import com.youappi.sdk.logic.impl.a;
import com.youappi.sdk.net.model.Vast;
import com.youappi.sdk.net.model.vast.MediaFileItem;
import com.youappi.sdk.ui.model.AdViewModel;
import com.youappi.sdk.utils.c;
import com.youappi.sdk.utils.e;

/* loaded from: classes2.dex */
public class VastResponseWrapper implements b<String> {
    private static final int MAX_ITERATIONS = 3;
    private IAdEventListener adEventListener;
    private a.InterfaceC0411a<AdViewModel> adViewModelAdInternalListener;
    private com.youappi.sdk.net.a api;
    private c.a basicConfiguration;
    private ConfigurationItem configurationItem;
    private Vast.Wrapper mCurrentWrapper;
    private VideoItem videoItem;

    public VastResponseWrapper(VideoItem videoItem, ConfigurationItem configurationItem, a.InterfaceC0411a<AdViewModel> interfaceC0411a, c.a aVar, com.youappi.sdk.net.a aVar2, IAdEventListener iAdEventListener) {
        this.videoItem = videoItem;
        this.configurationItem = configurationItem;
        this.adViewModelAdInternalListener = interfaceC0411a;
        this.basicConfiguration = aVar;
        this.api = aVar2;
        this.adEventListener = iAdEventListener;
    }

    private void iterate(String str, Vast.VastCarriageObject vastCarriageObject) {
        YAErrorCode yAErrorCode;
        RuntimeException runtimeException;
        VastError vastError;
        String str2;
        Vast vast = new Vast(str, vastCarriageObject);
        if (!vast.make(str)) {
            sendFailureResponse(YAErrorCode.VAST_ERROR, new RuntimeException("malformed vast"));
            verifyAndReportErrorEvent(VastError.VAST_ERROR_PARSING_FAILED, "Malformed");
        }
        if (vast.empty()) {
            sendFailureResponse(YAErrorCode.VAST_ERROR, new RuntimeException("Empty vast"));
            verifyAndReportErrorEvent(VastError.VAST_ERROR_EMPTY_VAST_RESPONSE, "Empty vast");
        }
        Vast.Inline popInline = vast.popInline();
        if (popInline == null) {
            this.mCurrentWrapper = vast.popWrapper();
            if (this.mCurrentWrapper == null) {
                yAErrorCode = YAErrorCode.VAST_ERROR;
                runtimeException = new RuntimeException("no inlines and no wrappers");
            } else {
                if (this.mCurrentWrapper.getGeneration() <= 3) {
                    this.api.a(this, this.mCurrentWrapper.getWrapperUrl());
                    return;
                }
                verifyAndReportErrorEvent(VastError.VAST_ERROR_WRAPPER_LIMIT_EXCEEDED, "iterations: " + this.mCurrentWrapper.getGeneration());
                yAErrorCode = YAErrorCode.VAST_ERROR;
                runtimeException = new RuntimeException("iterations: " + this.mCurrentWrapper.getGeneration());
            }
            sendFailureResponse(yAErrorCode, runtimeException);
            return;
        }
        VastError vastError2 = null;
        String str3 = null;
        while (popInline != null) {
            if (popInline.hasLinear()) {
                popInline.carriage();
                MediaFileItem a2 = e.a(popInline.getMediaFiles(), this.basicConfiguration.b(), this.basicConfiguration.c(), this.basicConfiguration.d());
                if (a2 != null) {
                    this.videoItem.mergeVast(popInline, a2.getUrl());
                }
                if (this.videoItem.isComplete()) {
                    sendSuccessResponse();
                    return;
                } else {
                    vastError = VastError.VAST_ERROR_AD_TYPE;
                    str2 = "no video url / mp4s";
                }
            } else {
                vastError = VastError.VAST_ERROR_AD_TYPE;
                str2 = "no linear creatives";
            }
            str3 = str2;
            vastError2 = vastError;
            popInline = vast.popInline();
        }
        sendFailureResponse(YAErrorCode.VAST_ERROR, new RuntimeException("no media"));
        verifyAndReportErrorEvent(vastError2, str3);
    }

    private void sendFailureResponse(YAErrorCode yAErrorCode, Exception exc) {
        if (this.adViewModelAdInternalListener != null) {
            this.adViewModelAdInternalListener.a(yAErrorCode, exc);
        }
    }

    private void sendSuccessResponse() {
        AdViewModel a2 = a.a(this.videoItem, this.configurationItem);
        if (this.adViewModelAdInternalListener != null) {
            this.adViewModelAdInternalListener.a(a2);
        }
    }

    private void verifyAndReportErrorEvent(VastError vastError, String str) {
        if (this.adEventListener != null) {
            this.adEventListener.onGotEvent("error", vastError, str, this.basicConfiguration.a() ? DeviceOrientation.Portrait : DeviceOrientation.Landscape, 0, this.videoItem);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // com.a.a.a.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onNetError(d dVar) {
        VastError vastError;
        String str;
        if (dVar.b() == null) {
            return false;
        }
        Exception exc = Exception.class.isAssignableFrom(dVar.b().getClass()) ? (Exception) dVar.b() : null;
        if (dVar.c() != 408 && dVar.c() != 504) {
            if (Exception.class.isAssignableFrom(dVar.b().getClass())) {
                vastError = VastError.VAST_ERROR_WRAPPER_ERROR;
                str = exc != null ? exc.getMessage() : "";
            }
            if (exc != null) {
                return false;
            }
            sendFailureResponse(YAErrorCode.SERVER_ERROR, exc);
            return false;
        }
        vastError = VastError.VAST_ERROR_VAST_REDIRECT_TIME_OUT;
        str = "VAST redirect timeout";
        verifyAndReportErrorEvent(vastError, str);
        if (exc != null) {
        }
    }

    @Override // com.a.a.a.b
    public boolean onNetFinished(f<String> fVar) {
        iterate(fVar.b(), this.mCurrentWrapper);
        return false;
    }

    public void start() {
        iterate(this.videoItem.getVideoConfig().getVastRawString(), null);
    }
}
