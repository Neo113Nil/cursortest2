package com.facebook.share.widget;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.DialogFeature;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.share.Sharer;
import com.facebook.share.internal.LegacyNativeDialogParameters;
import com.facebook.share.internal.MessageDialogFeature;
import com.facebook.share.internal.NativeDialogParameters;
import com.facebook.share.internal.ShareContentValidation;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import defpackage.fr0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class MessageDialog extends ShareDialog implements Sharer {
    private static final int DEFAULT_REQUEST_CODE = CallbackManagerImpl.RequestCodeOffset.Message.toRequestCode();
    private boolean shouldFailOnDataError;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MessageDialog(Activity activity) {
        super(activity, r0);
        int i = DEFAULT_REQUEST_CODE;
        this.shouldFailOnDataError = false;
        ShareInternalUtility.registerStaticShareCallback(i);
    }

    public static boolean canShow(Class<? extends ShareContent<?, ?>> cls) {
        DialogFeature feature = getFeature(cls);
        return feature != null && DialogPresenter.canPresentNativeDialogWithFeature(feature);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DialogFeature getFeature(Class<? extends ShareContent> cls) {
        if (ShareLinkContent.class.isAssignableFrom(cls)) {
            return MessageDialogFeature.MESSAGE_DIALOG;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logDialogShare(Context context, ShareContent shareContent, AppCall appCall) {
        DialogFeature feature = getFeature(shareContent.getClass());
        String str = feature == MessageDialogFeature.MESSAGE_DIALOG ? AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS : feature == MessageDialogFeature.MESSENGER_GENERIC_TEMPLATE ? AnalyticsEvents.PARAMETER_SHARE_MESSENGER_GENERIC_TEMPLATE : feature == MessageDialogFeature.MESSENGER_MEDIA_TEMPLATE ? AnalyticsEvents.PARAMETER_SHARE_MESSENGER_MEDIA_TEMPLATE : "unknown";
        InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(context);
        Bundle bundle = new Bundle();
        bundle.putString(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_TYPE, str);
        bundle.putString(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_UUID, appCall.getCallId().toString());
        bundle.putString(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PAGE_ID, shareContent.getPageId());
        internalAppEventsLogger.logEventImplicitly(AnalyticsEvents.EVENT_SHARE_MESSENGER_DIALOG_SHOW, bundle);
    }

    public static void show(Activity activity, ShareContent shareContent) {
        new MessageDialog(activity).show(shareContent);
    }

    @Override // com.facebook.share.widget.ShareDialog, com.facebook.internal.FacebookDialogBase
    public AppCall createBaseAppCall() {
        return new AppCall(getRequestCode());
    }

    @Override // com.facebook.share.widget.ShareDialog, com.facebook.internal.FacebookDialogBase
    public List<FacebookDialogBase<ShareContent<?, ?>, Sharer.Result>.ModeHandler> getOrderedModeHandlers() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NativeHandler());
        return arrayList;
    }

    @Override // com.facebook.share.widget.ShareDialog, com.facebook.share.Sharer
    public boolean getShouldFailOnDataError() {
        return this.shouldFailOnDataError;
    }

    @Override // com.facebook.share.widget.ShareDialog, com.facebook.internal.FacebookDialogBase
    public void registerCallbackImpl(CallbackManagerImpl callbackManagerImpl, FacebookCallback<Sharer.Result> facebookCallback) {
        ShareInternalUtility.registerSharerCallback(getRequestCode(), callbackManagerImpl, facebookCallback);
    }

    @Override // com.facebook.share.widget.ShareDialog, com.facebook.share.Sharer
    public void setShouldFailOnDataError(boolean z) {
        this.shouldFailOnDataError = z;
    }

    public static void show(fr0 fr0Var, ShareContent shareContent) {
        show(new FragmentWrapper(fr0Var), shareContent);
    }

    public static void show(Fragment fragment, ShareContent shareContent) {
        show(new FragmentWrapper(fragment), shareContent);
    }

    private static void show(FragmentWrapper fragmentWrapper, ShareContent shareContent) {
        new MessageDialog(fragmentWrapper).show(shareContent);
    }

    public MessageDialog(fr0 fr0Var) {
        this(new FragmentWrapper(fr0Var));
    }

    public MessageDialog(Fragment fragment) {
        this(new FragmentWrapper(fragment));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private MessageDialog(FragmentWrapper fragmentWrapper) {
        super(fragmentWrapper, r0);
        int i = DEFAULT_REQUEST_CODE;
        this.shouldFailOnDataError = false;
        ShareInternalUtility.registerStaticShareCallback(i);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public class NativeHandler extends FacebookDialogBase<ShareContent<?, ?>, Sharer.Result>.ModeHandler {
        private NativeHandler() {
            super();
        }

        /* renamed from: canShow, reason: avoid collision after fix types in other method */
        public boolean canShow2(ShareContent shareContent, boolean z) {
            return shareContent != null && MessageDialog.canShow((Class<? extends ShareContent<?, ?>>) shareContent.getClass());
        }

        /* renamed from: createAppCall, reason: avoid collision after fix types in other method */
        public AppCall createAppCall2(final ShareContent shareContent) {
            ShareContentValidation.validateForMessage(shareContent);
            final AppCall createBaseAppCall = MessageDialog.this.createBaseAppCall();
            final boolean shouldFailOnDataError = MessageDialog.this.getShouldFailOnDataError();
            MessageDialog.logDialogShare(MessageDialog.this.getActivityContext(), shareContent, createBaseAppCall);
            DialogPresenter.setupAppCallForNativeDialog(createBaseAppCall, new DialogPresenter.ParameterProvider() { // from class: com.facebook.share.widget.MessageDialog.NativeHandler.1
                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public Bundle getLegacyParameters() {
                    return LegacyNativeDialogParameters.create(createBaseAppCall.getCallId(), (ShareContent<?, ?>) shareContent, shouldFailOnDataError);
                }

                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public Bundle getParameters() {
                    return NativeDialogParameters.create(createBaseAppCall.getCallId(), (ShareContent<?, ?>) shareContent, shouldFailOnDataError);
                }
            }, MessageDialog.getFeature(shareContent.getClass()));
            return createBaseAppCall;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public /* bridge */ /* synthetic */ boolean canShow(ShareContent<?, ?> shareContent, boolean z) {
            return canShow2((ShareContent) shareContent, z);
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public /* bridge */ /* synthetic */ AppCall createAppCall(ShareContent<?, ?> shareContent) {
            return createAppCall2((ShareContent) shareContent);
        }
    }

    public MessageDialog(Activity activity, int i) {
        super(activity, i);
        this.shouldFailOnDataError = false;
        ShareInternalUtility.registerStaticShareCallback(i);
    }

    public MessageDialog(fr0 fr0Var, int i) {
        this(new FragmentWrapper(fr0Var), i);
    }

    public MessageDialog(Fragment fragment, int i) {
        this(new FragmentWrapper(fragment), i);
    }

    private MessageDialog(FragmentWrapper fragmentWrapper, int i) {
        super(fragmentWrapper, i);
        this.shouldFailOnDataError = false;
        ShareInternalUtility.registerStaticShareCallback(i);
    }
}
