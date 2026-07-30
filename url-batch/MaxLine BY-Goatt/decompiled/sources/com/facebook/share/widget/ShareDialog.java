package com.facebook.share.widget;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookCallback;
import com.facebook.FacebookSdk;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.DialogFeature;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.NativeAppCallAttachmentStore;
import com.facebook.share.Sharer;
import com.facebook.share.internal.CameraEffectFeature;
import com.facebook.share.internal.LegacyNativeDialogParameters;
import com.facebook.share.internal.NativeDialogParameters;
import com.facebook.share.internal.ShareContentValidation;
import com.facebook.share.internal.ShareDialogFeature;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.internal.ShareStoryFeature;
import com.facebook.share.internal.WebDialogParameters;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideoContent;
import defpackage.fr0;
import defpackage.qv;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class ShareDialog extends FacebookDialogBase<ShareContent<?, ?>, Sharer.Result> implements Sharer {
    private static final String FEED_DIALOG = "feed";
    private static final String WEB_OG_SHARE_DIALOG = "share_open_graph";
    public static final String WEB_SHARE_DIALOG = "share";
    private boolean isAutomaticMode;
    private final List<FacebookDialogBase<ShareContent<?, ?>, Sharer.Result>.ModeHandler> orderedModeHandlers;
    private boolean shouldFailOnDataError;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "ShareDialog";
    private static final int DEFAULT_REQUEST_CODE = CallbackManagerImpl.RequestCodeOffset.Share.toRequestCode();

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public final class CameraEffectHandler extends FacebookDialogBase<ShareContent<?, ?>, Sharer.Result>.ModeHandler {
        private Object mode;

        public CameraEffectHandler() {
            super();
            this.mode = Mode.NATIVE;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(ShareContent<?, ?> shareContent, boolean z) {
            shareContent.getClass();
            return (shareContent instanceof ShareCameraEffectContent) && ShareDialog.Companion.canShowNative(shareContent.getClass());
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public AppCall createAppCall(final ShareContent<?, ?> shareContent) {
            shareContent.getClass();
            ShareContentValidation.validateForNativeShare(shareContent);
            final AppCall createBaseAppCall = ShareDialog.this.createBaseAppCall();
            final boolean shouldFailOnDataError = ShareDialog.this.getShouldFailOnDataError();
            DialogFeature feature = ShareDialog.Companion.getFeature(shareContent.getClass());
            if (feature == null) {
                return null;
            }
            DialogPresenter.setupAppCallForNativeDialog(createBaseAppCall, new DialogPresenter.ParameterProvider() { // from class: com.facebook.share.widget.ShareDialog$CameraEffectHandler$createAppCall$1
                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public Bundle getLegacyParameters() {
                    return LegacyNativeDialogParameters.create(AppCall.this.getCallId(), shareContent, shouldFailOnDataError);
                }

                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public Bundle getParameters() {
                    return NativeDialogParameters.create(AppCall.this.getCallId(), shareContent, shouldFailOnDataError);
                }
            }, feature);
            return createBaseAppCall;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public Object getMode() {
            return this.mode;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public void setMode(Object obj) {
            obj.getClass();
            this.mode = obj;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public final class FeedHandler extends FacebookDialogBase<ShareContent<?, ?>, Sharer.Result>.ModeHandler {
        private Object mode;

        public FeedHandler() {
            super();
            this.mode = Mode.FEED;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(ShareContent<?, ?> shareContent, boolean z) {
            shareContent.getClass();
            return (shareContent instanceof ShareLinkContent) || (shareContent instanceof ShareFeedContent);
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public AppCall createAppCall(ShareContent<?, ?> shareContent) {
            Bundle createForFeed;
            shareContent.getClass();
            ShareDialog shareDialog = ShareDialog.this;
            shareDialog.logDialogShare(shareDialog.getActivityContext(), shareContent, Mode.FEED);
            AppCall createBaseAppCall = ShareDialog.this.createBaseAppCall();
            if (shareContent instanceof ShareLinkContent) {
                ShareContentValidation.validateForWebShare(shareContent);
                createForFeed = WebDialogParameters.createForFeed((ShareLinkContent) shareContent);
            } else {
                if (!(shareContent instanceof ShareFeedContent)) {
                    return null;
                }
                createForFeed = WebDialogParameters.createForFeed((ShareFeedContent) shareContent);
            }
            DialogPresenter.setupAppCallForWebDialog(createBaseAppCall, ShareDialog.FEED_DIALOG, createForFeed);
            return createBaseAppCall;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public Object getMode() {
            return this.mode;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public void setMode(Object obj) {
            obj.getClass();
            this.mode = obj;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public enum Mode {
        AUTOMATIC,
        NATIVE,
        WEB,
        FEED
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public final class NativeHandler extends FacebookDialogBase<ShareContent<?, ?>, Sharer.Result>.ModeHandler {
        private Object mode;

        public NativeHandler() {
            super();
            this.mode = Mode.NATIVE;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(ShareContent<?, ?> shareContent, boolean z) {
            boolean z2;
            String quote;
            shareContent.getClass();
            if (!(shareContent instanceof ShareCameraEffectContent) && !(shareContent instanceof ShareStoryContent)) {
                if (!z) {
                    z2 = shareContent.getShareHashtag() != null ? DialogPresenter.canPresentNativeDialogWithFeature(ShareDialogFeature.HASHTAG) : true;
                    if ((shareContent instanceof ShareLinkContent) && (quote = ((ShareLinkContent) shareContent).getQuote()) != null && quote.length() != 0) {
                        if (!z2 || !DialogPresenter.canPresentNativeDialogWithFeature(ShareDialogFeature.LINK_SHARE_QUOTES)) {
                            z2 = false;
                        }
                    }
                    if (!z2 && ShareDialog.Companion.canShowNative(shareContent.getClass())) {
                        return true;
                    }
                }
                z2 = true;
                if (!z2) {
                }
            }
            return false;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public AppCall createAppCall(final ShareContent<?, ?> shareContent) {
            shareContent.getClass();
            ShareDialog shareDialog = ShareDialog.this;
            shareDialog.logDialogShare(shareDialog.getActivityContext(), shareContent, Mode.NATIVE);
            ShareContentValidation.validateForNativeShare(shareContent);
            final AppCall createBaseAppCall = ShareDialog.this.createBaseAppCall();
            final boolean shouldFailOnDataError = ShareDialog.this.getShouldFailOnDataError();
            DialogFeature feature = ShareDialog.Companion.getFeature(shareContent.getClass());
            if (feature == null) {
                return null;
            }
            DialogPresenter.setupAppCallForNativeDialog(createBaseAppCall, new DialogPresenter.ParameterProvider() { // from class: com.facebook.share.widget.ShareDialog$NativeHandler$createAppCall$1
                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public Bundle getLegacyParameters() {
                    return LegacyNativeDialogParameters.create(AppCall.this.getCallId(), shareContent, shouldFailOnDataError);
                }

                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public Bundle getParameters() {
                    return NativeDialogParameters.create(AppCall.this.getCallId(), shareContent, shouldFailOnDataError);
                }
            }, feature);
            return createBaseAppCall;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public Object getMode() {
            return this.mode;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public void setMode(Object obj) {
            obj.getClass();
            this.mode = obj;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public final class ShareStoryHandler extends FacebookDialogBase<ShareContent<?, ?>, Sharer.Result>.ModeHandler {
        private Object mode;

        public ShareStoryHandler() {
            super();
            this.mode = Mode.NATIVE;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(ShareContent<?, ?> shareContent, boolean z) {
            shareContent.getClass();
            return (shareContent instanceof ShareStoryContent) && ShareDialog.Companion.canShowNative(shareContent.getClass());
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public AppCall createAppCall(final ShareContent<?, ?> shareContent) {
            shareContent.getClass();
            ShareContentValidation.validateForStoryShare(shareContent);
            final AppCall createBaseAppCall = ShareDialog.this.createBaseAppCall();
            final boolean shouldFailOnDataError = ShareDialog.this.getShouldFailOnDataError();
            DialogFeature feature = ShareDialog.Companion.getFeature(shareContent.getClass());
            if (feature == null) {
                return null;
            }
            DialogPresenter.setupAppCallForNativeDialog(createBaseAppCall, new DialogPresenter.ParameterProvider() { // from class: com.facebook.share.widget.ShareDialog$ShareStoryHandler$createAppCall$1
                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public Bundle getLegacyParameters() {
                    return LegacyNativeDialogParameters.create(AppCall.this.getCallId(), shareContent, shouldFailOnDataError);
                }

                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public Bundle getParameters() {
                    return NativeDialogParameters.create(AppCall.this.getCallId(), shareContent, shouldFailOnDataError);
                }
            }, feature);
            return createBaseAppCall;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public Object getMode() {
            return this.mode;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public void setMode(Object obj) {
            obj.getClass();
            this.mode = obj;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public final class WebShareHandler extends FacebookDialogBase<ShareContent<?, ?>, Sharer.Result>.ModeHandler {
        private Object mode;

        public WebShareHandler() {
            super();
            this.mode = Mode.WEB;
        }

        private final SharePhotoContent createAndMapAttachments(SharePhotoContent sharePhotoContent, UUID uuid) {
            SharePhotoContent.Builder readFrom = new SharePhotoContent.Builder().readFrom(sharePhotoContent);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = sharePhotoContent.getPhotos().size();
            for (int i = 0; i < size; i++) {
                SharePhoto sharePhoto = sharePhotoContent.getPhotos().get(i);
                Bitmap bitmap = sharePhoto.getBitmap();
                if (bitmap != null) {
                    NativeAppCallAttachmentStore.Attachment createAttachment = NativeAppCallAttachmentStore.createAttachment(uuid, bitmap);
                    sharePhoto = new SharePhoto.Builder().readFrom(sharePhoto).setImageUrl(Uri.parse(createAttachment.getAttachmentUrl())).setBitmap(null).build();
                    arrayList2.add(createAttachment);
                }
                arrayList.add(sharePhoto);
            }
            readFrom.setPhotos(arrayList);
            NativeAppCallAttachmentStore.addAttachments(arrayList2);
            return readFrom.build();
        }

        private final String getActionName(ShareContent<?, ?> shareContent) {
            if ((shareContent instanceof ShareLinkContent) || (shareContent instanceof SharePhotoContent)) {
                return "share";
            }
            return null;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(ShareContent<?, ?> shareContent, boolean z) {
            shareContent.getClass();
            return ShareDialog.Companion.canShowWebCheck(shareContent);
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public AppCall createAppCall(ShareContent<?, ?> shareContent) {
            Bundle create;
            shareContent.getClass();
            ShareDialog shareDialog = ShareDialog.this;
            shareDialog.logDialogShare(shareDialog.getActivityContext(), shareContent, Mode.WEB);
            AppCall createBaseAppCall = ShareDialog.this.createBaseAppCall();
            ShareContentValidation.validateForWebShare(shareContent);
            if (shareContent instanceof ShareLinkContent) {
                create = WebDialogParameters.create((ShareLinkContent) shareContent);
            } else {
                if (!(shareContent instanceof SharePhotoContent)) {
                    return null;
                }
                create = WebDialogParameters.create(createAndMapAttachments((SharePhotoContent) shareContent, createBaseAppCall.getCallId()));
            }
            DialogPresenter.setupAppCallForWebDialog(createBaseAppCall, getActionName(shareContent), create);
            return createBaseAppCall;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public Object getMode() {
            return this.mode;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public void setMode(Object obj) {
            obj.getClass();
            this.mode = obj;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.AUTOMATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mode.WEB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Mode.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareDialog(Activity activity, int i) {
        super(activity, i);
        activity.getClass();
        this.isAutomaticMode = true;
        this.orderedModeHandlers = qv.d(new NativeHandler(), new FeedHandler(), new WebShareHandler(), new CameraEffectHandler(), new ShareStoryHandler());
        ShareInternalUtility.registerStaticShareCallback(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logDialogShare(Context context, ShareContent<?, ?> shareContent, Mode mode) {
        if (this.isAutomaticMode) {
            mode = Mode.AUTOMATIC;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        String str = "unknown";
        String str2 = i != 1 ? i != 2 ? i != 3 ? "unknown" : AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE : AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_WEB : AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC;
        DialogFeature feature = Companion.getFeature(shareContent.getClass());
        if (feature == ShareDialogFeature.SHARE_DIALOG) {
            str = AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS;
        } else if (feature == ShareDialogFeature.PHOTOS) {
            str = AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO;
        } else if (feature == ShareDialogFeature.VIDEO) {
            str = AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO;
        }
        InternalAppEventsLogger createInstance = InternalAppEventsLogger.Companion.createInstance(context, FacebookSdk.getApplicationId());
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_show", str2);
        bundle.putString(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_TYPE, str);
        createInstance.logEventImplicitly("fb_share_dialog_show", bundle);
    }

    public boolean canShow(ShareContent<?, ?> shareContent, Mode mode) {
        shareContent.getClass();
        mode.getClass();
        Object obj = mode;
        if (mode == Mode.AUTOMATIC) {
            obj = FacebookDialogBase.BASE_AUTOMATIC_MODE;
        }
        return canShowImpl(shareContent, obj);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public AppCall createBaseAppCall() {
        return new AppCall(getRequestCode(), null, 2, null);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public List<FacebookDialogBase<ShareContent<?, ?>, Sharer.Result>.ModeHandler> getOrderedModeHandlers() {
        return this.orderedModeHandlers;
    }

    public boolean getShouldFailOnDataError() {
        return this.shouldFailOnDataError;
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void registerCallbackImpl(CallbackManagerImpl callbackManagerImpl, FacebookCallback<Sharer.Result> facebookCallback) {
        callbackManagerImpl.getClass();
        facebookCallback.getClass();
        ShareInternalUtility.registerSharerCallback(getRequestCode(), callbackManagerImpl, facebookCallback);
    }

    public void setShouldFailOnDataError(boolean z) {
        this.shouldFailOnDataError = z;
    }

    public void show(ShareContent<?, ?> shareContent, Mode mode) {
        shareContent.getClass();
        mode.getClass();
        boolean z = mode == Mode.AUTOMATIC;
        this.isAutomaticMode = z;
        Object obj = mode;
        if (z) {
            obj = FacebookDialogBase.BASE_AUTOMATIC_MODE;
        }
        showImpl(shareContent, obj);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean canShowNative(Class<? extends ShareContent<?, ?>> cls) {
            DialogFeature feature = getFeature(cls);
            return feature != null && DialogPresenter.canPresentNativeDialogWithFeature(feature);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final boolean canShowWebCheck(ShareContent<?, ?> shareContent) {
            return canShowWebTypeCheck(shareContent.getClass());
        }

        private final boolean canShowWebTypeCheck(Class<? extends ShareContent<?, ?>> cls) {
            if (ShareLinkContent.class.isAssignableFrom(cls)) {
                return true;
            }
            return SharePhotoContent.class.isAssignableFrom(cls) && AccessToken.Companion.isCurrentAccessTokenActive();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DialogFeature getFeature(Class<? extends ShareContent<?, ?>> cls) {
            if (ShareLinkContent.class.isAssignableFrom(cls)) {
                return ShareDialogFeature.SHARE_DIALOG;
            }
            if (SharePhotoContent.class.isAssignableFrom(cls)) {
                return ShareDialogFeature.PHOTOS;
            }
            if (ShareVideoContent.class.isAssignableFrom(cls)) {
                return ShareDialogFeature.VIDEO;
            }
            if (ShareMediaContent.class.isAssignableFrom(cls)) {
                return ShareDialogFeature.MULTIMEDIA;
            }
            if (ShareCameraEffectContent.class.isAssignableFrom(cls)) {
                return CameraEffectFeature.SHARE_CAMERA_EFFECT;
            }
            if (ShareStoryContent.class.isAssignableFrom(cls)) {
                return ShareStoryFeature.SHARE_STORY_ASSET;
            }
            return null;
        }

        public boolean canShow(Class<? extends ShareContent<?, ?>> cls) {
            cls.getClass();
            return canShowWebTypeCheck(cls) || canShowNative(cls);
        }

        public void show(Activity activity, ShareContent<?, ?> shareContent) {
            activity.getClass();
            shareContent.getClass();
            new ShareDialog(activity).show(shareContent);
        }

        private Companion() {
        }

        public void show(fr0 fr0Var, ShareContent<?, ?> shareContent) {
            fr0Var.getClass();
            shareContent.getClass();
            show(new FragmentWrapper(fr0Var), shareContent);
        }

        public void show(Fragment fragment, ShareContent<?, ?> shareContent) {
            fragment.getClass();
            shareContent.getClass();
            show(new FragmentWrapper(fragment), shareContent);
        }

        private final void show(FragmentWrapper fragmentWrapper, ShareContent<?, ?> shareContent) {
            new ShareDialog(fragmentWrapper, 0, 2, null).show(shareContent);
        }
    }

    public static boolean canShow(Class<? extends ShareContent<?, ?>> cls) {
        return Companion.canShow(cls);
    }

    public static void show(Activity activity, ShareContent<?, ?> shareContent) {
        Companion.show(activity, shareContent);
    }

    public static void show(Fragment fragment, ShareContent<?, ?> shareContent) {
        Companion.show(fragment, shareContent);
    }

    public static void show(fr0 fr0Var, ShareContent<?, ?> shareContent) {
        Companion.show(fr0Var, shareContent);
    }

    public ShareDialog(int i) {
        super(i);
        this.isAutomaticMode = true;
        this.orderedModeHandlers = qv.d(new NativeHandler(), new FeedHandler(), new WebShareHandler(), new CameraEffectHandler(), new ShareStoryHandler());
        ShareInternalUtility.registerStaticShareCallback(i);
    }

    public /* synthetic */ ShareDialog(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? DEFAULT_REQUEST_CODE : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShareDialog(fr0 fr0Var) {
        this(new FragmentWrapper(fr0Var), 0, 2, null);
        fr0Var.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShareDialog(Fragment fragment) {
        this(new FragmentWrapper(fragment), 0, 2, null);
        fragment.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShareDialog(Activity activity) {
        this(activity, DEFAULT_REQUEST_CODE);
        activity.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShareDialog(fr0 fr0Var, int i) {
        this(new FragmentWrapper(fr0Var), i);
        fr0Var.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShareDialog(Fragment fragment, int i) {
        this(new FragmentWrapper(fragment), i);
        fragment.getClass();
    }

    public /* synthetic */ ShareDialog(FragmentWrapper fragmentWrapper, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentWrapper, (i2 & 2) != 0 ? DEFAULT_REQUEST_CODE : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareDialog(FragmentWrapper fragmentWrapper, int i) {
        super(fragmentWrapper, i);
        fragmentWrapper.getClass();
        this.isAutomaticMode = true;
        this.orderedModeHandlers = qv.d(new NativeHandler(), new FeedHandler(), new WebShareHandler(), new CameraEffectHandler(), new ShareStoryHandler());
        ShareInternalUtility.registerStaticShareCallback(i);
    }
}
