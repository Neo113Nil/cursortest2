package com.facebook.login.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.Profile;
import com.facebook.ProfileTracker;
import com.facebook.internal.ImageDownloader;
import com.facebook.internal.ImageRequest;
import com.facebook.internal.ImageResponse;
import com.facebook.internal.Logger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.R;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.k4;
import defpackage.lh;
import defpackage.tp2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ProfilePictureView extends FrameLayout {
    private static final String BITMAP_HEIGHT_KEY = "ProfilePictureView_height";
    private static final String BITMAP_KEY = "ProfilePictureView_bitmap";
    private static final String BITMAP_WIDTH_KEY = "ProfilePictureView_width";
    public static final int CUSTOM = -1;
    private static final boolean IS_CROPPED_DEFAULT_VALUE = true;
    private static final String IS_CROPPED_KEY = "ProfilePictureView_isCropped";
    public static final int LARGE = -4;
    private static final int MIN_SIZE = 1;
    public static final int NORMAL = -3;
    private static final String PENDING_REFRESH_KEY = "ProfilePictureView_refresh";
    private static final String PRESET_SIZE_KEY = "ProfilePictureView_presetSize";
    private static final String PROFILE_ID_KEY = "ProfilePictureView_profileId";
    public static final int SMALL = -2;
    private static final String SUPER_STATE_KEY = "ProfilePictureView_superState";
    private Bitmap customizedDefaultProfilePicture;
    private final ImageView image;
    private Bitmap imageContents;
    private boolean isCropped;
    private ImageRequest lastRequest;
    private OnErrorListener onErrorListener;
    private int presetSize;
    private String profileId;
    private ProfileTracker profileTracker;
    private int queryHeight;
    private int queryWidth;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "ProfilePictureView";

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface OnErrorListener {
        void onError(FacebookException facebookException);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.image = new ImageView(getContext());
        this.isCropped = IS_CROPPED_DEFAULT_VALUE;
        this.presetSize = -1;
        initialize();
        parseAttributes(attributeSet);
    }

    private final int getPresetSizeInPixels(boolean z) {
        int i;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            int i2 = this.presetSize;
            if (i2 == -1 && !z) {
                return 0;
            }
            if (i2 == -4) {
                i = R.dimen.com_facebook_profilepictureview_preset_size_large;
            } else if (i2 == -3) {
                i = R.dimen.com_facebook_profilepictureview_preset_size_normal;
            } else if (i2 == -2) {
                i = R.dimen.com_facebook_profilepictureview_preset_size_small;
            } else {
                if (i2 != -1) {
                    return 0;
                }
                i = R.dimen.com_facebook_profilepictureview_preset_size_normal;
            }
            return getResources().getDimensionPixelSize(i);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    private final Uri getProfilePictureUri(String str) {
        Profile currentProfile = Profile.Companion.getCurrentProfile();
        return (currentProfile == null || !AccessToken.Companion.isLoggedInWithInstagram()) ? ImageRequest.Companion.getProfilePictureUri(this.profileId, this.queryWidth, this.queryHeight, str) : currentProfile.getProfilePictureUri(this.queryWidth, this.queryHeight);
    }

    private final void initialize() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            removeAllViews();
            this.image.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.image.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            addView(this.image);
            this.profileTracker = new ProfileTracker() { // from class: com.facebook.login.widget.ProfilePictureView$initialize$1
                @Override // com.facebook.ProfileTracker
                public void onCurrentProfileChanged(Profile profile, Profile profile2) {
                    ProfilePictureView.this.setProfileId(profile2 != null ? profile2.getId() : null);
                    ProfilePictureView.this.refreshImage(true);
                }
            };
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final boolean isUnspecifiedDimensions() {
        if (this.queryWidth == 0 && this.queryHeight == 0) {
            return IS_CROPPED_DEFAULT_VALUE;
        }
        return false;
    }

    private final void parseAttributes(AttributeSet attributeSet) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.com_facebook_profile_picture_view);
            obtainStyledAttributes.getClass();
            setPresetSize(obtainStyledAttributes.getInt(R.styleable.com_facebook_profile_picture_view_com_facebook_preset_size, -1));
            setCropped(obtainStyledAttributes.getBoolean(R.styleable.com_facebook_profile_picture_view_com_facebook_is_cropped, IS_CROPPED_DEFAULT_VALUE));
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void processResponse(ImageResponse imageResponse) {
        if (CrashShieldHandler.isObjectCrashing(this) || imageResponse == null) {
            return;
        }
        try {
            if (Intrinsics.b(imageResponse.getRequest(), this.lastRequest)) {
                this.lastRequest = null;
                Bitmap bitmap = imageResponse.getBitmap();
                Exception error = imageResponse.getError();
                if (error == null) {
                    if (bitmap != null) {
                        setImageBitmap(bitmap);
                        if (imageResponse.isCachedRedirect()) {
                            sendImageRequest(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                OnErrorListener onErrorListener = this.onErrorListener;
                if (onErrorListener == null) {
                    Logger.Companion.log(LoggingBehavior.REQUESTS, 6, TAG, error.toString());
                    return;
                }
                onErrorListener.onError(new FacebookException("Error in downloading profile picture for profileId: " + this.profileId, error));
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshImage(boolean z) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            boolean updateImageQueryParameters = updateImageQueryParameters();
            String str = this.profileId;
            if (str != null && str.length() != 0 && !isUnspecifiedDimensions()) {
                if (!updateImageQueryParameters && !z) {
                    return;
                }
                sendImageRequest(IS_CROPPED_DEFAULT_VALUE);
                return;
            }
            setBlankProfilePicture();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void sendImageRequest(boolean z) {
        AccessToken currentAccessToken;
        String token;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            AccessToken.Companion companion = AccessToken.Companion;
            boolean isCurrentAccessTokenActive = companion.isCurrentAccessTokenActive();
            String str = BuildConfig.FLAVOR;
            if (isCurrentAccessTokenActive && (currentAccessToken = companion.getCurrentAccessToken()) != null && (token = currentAccessToken.getToken()) != null) {
                str = token;
            }
            Uri profilePictureUri = getProfilePictureUri(str);
            Context context = getContext();
            context.getClass();
            ImageRequest build = new ImageRequest.Builder(context, profilePictureUri).setAllowCachedRedirects(z).setCallerTag(this).setCallback(new k4(12, this)).build();
            ImageRequest imageRequest = this.lastRequest;
            if (imageRequest != null) {
                ImageDownloader.cancelRequest(imageRequest);
            }
            this.lastRequest = build;
            ImageDownloader.downloadAsync(build);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendImageRequest$lambda$2(ProfilePictureView profilePictureView, ImageResponse imageResponse) {
        profilePictureView.getClass();
        profilePictureView.processResponse(imageResponse);
    }

    private final void setBlankProfilePicture() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            ImageRequest imageRequest = this.lastRequest;
            if (imageRequest != null) {
                ImageDownloader.cancelRequest(imageRequest);
            }
            Bitmap bitmap = this.customizedDefaultProfilePicture;
            if (bitmap == null) {
                setImageBitmap(BitmapFactory.decodeResource(getResources(), this.isCropped ? R.drawable.com_facebook_profile_picture_blank_square : R.drawable.com_facebook_profile_picture_blank_portrait));
                return;
            }
            updateImageQueryParameters();
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, this.queryWidth, this.queryHeight, false);
            createScaledBitmap.getClass();
            setImageBitmap(createScaledBitmap);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void setImageBitmap(Bitmap bitmap) {
        if (CrashShieldHandler.isObjectCrashing(this) || bitmap == null) {
            return;
        }
        try {
            this.imageContents = bitmap;
            this.image.setImageBitmap(bitmap);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final boolean updateImageQueryParameters() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            int height = getHeight();
            int width = getWidth();
            boolean z = IS_CROPPED_DEFAULT_VALUE;
            if (width >= 1 && height >= 1) {
                int presetSizeInPixels = getPresetSizeInPixels(false);
                if (presetSizeInPixels != 0) {
                    height = presetSizeInPixels;
                    width = height;
                }
                boolean z2 = this.isCropped;
                if (width <= height) {
                    height = z2 ? width : 0;
                } else {
                    width = z2 ? height : 0;
                }
                if (width == this.queryWidth && height == this.queryHeight) {
                    z = false;
                }
                this.queryWidth = width;
                this.queryHeight = height;
                return z;
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    public final OnErrorListener getOnErrorListener() {
        return this.onErrorListener;
    }

    public final int getPresetSize() {
        return this.presetSize;
    }

    public final String getProfileId() {
        return this.profileId;
    }

    public final boolean getShouldUpdateOnProfileChange() {
        ProfileTracker profileTracker = this.profileTracker;
        if (profileTracker != null) {
            return profileTracker.isTracking();
        }
        return false;
    }

    public final boolean isCropped() {
        return this.isCropped;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.lastRequest = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        refreshImage(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i2);
        boolean z2 = IS_CROPPED_DEFAULT_VALUE;
        if (mode == 1073741824 || layoutParams.height != -2) {
            z = false;
        } else {
            size = getPresetSizeInPixels(IS_CROPPED_DEFAULT_VALUE);
            i2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            z = true;
        }
        if (View.MeasureSpec.getMode(i) == 1073741824 || layoutParams.width != -2) {
            z2 = z;
        } else {
            size2 = getPresetSizeInPixels(IS_CROPPED_DEFAULT_VALUE);
            i = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
        }
        if (!z2) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(size2, size);
            measureChildren(i, i2);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        parcelable.getClass();
        if (!parcelable.getClass().equals(Bundle.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable(SUPER_STATE_KEY));
        setProfileId(bundle.getString(PROFILE_ID_KEY));
        setPresetSize(bundle.getInt(PRESET_SIZE_KEY));
        setCropped(bundle.getBoolean(IS_CROPPED_KEY));
        this.queryWidth = bundle.getInt(BITMAP_WIDTH_KEY);
        this.queryHeight = bundle.getInt(BITMAP_HEIGHT_KEY);
        refreshImage(IS_CROPPED_DEFAULT_VALUE);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable(SUPER_STATE_KEY, onSaveInstanceState);
        bundle.putString(PROFILE_ID_KEY, this.profileId);
        bundle.putInt(PRESET_SIZE_KEY, this.presetSize);
        bundle.putBoolean(IS_CROPPED_KEY, this.isCropped);
        bundle.putInt(BITMAP_WIDTH_KEY, this.queryWidth);
        bundle.putInt(BITMAP_HEIGHT_KEY, this.queryHeight);
        bundle.putBoolean(PENDING_REFRESH_KEY, this.lastRequest != null ? IS_CROPPED_DEFAULT_VALUE : false);
        return bundle;
    }

    public final void setCropped(boolean z) {
        this.isCropped = z;
        refreshImage(false);
    }

    public final void setDefaultProfilePicture(Bitmap bitmap) {
        this.customizedDefaultProfilePicture = bitmap;
    }

    public final void setOnErrorListener(OnErrorListener onErrorListener) {
        this.onErrorListener = onErrorListener;
    }

    public final void setPresetSize(int i) {
        if (i != -4 && i != -3 && i != -2 && i != -1) {
            lh.e("Must use a predefined preset size");
        } else {
            this.presetSize = i;
            requestLayout();
        }
    }

    public final void setProfileId(String str) {
        String str2 = this.profileId;
        boolean z = IS_CROPPED_DEFAULT_VALUE;
        if (str2 == null || str2.length() == 0 || !tp2.i(this.profileId, str, IS_CROPPED_DEFAULT_VALUE)) {
            setBlankProfilePicture();
        } else {
            z = false;
        }
        this.profileId = str;
        refreshImage(z);
    }

    public final void setShouldUpdateOnProfileChange(boolean z) {
        ProfileTracker profileTracker = this.profileTracker;
        if (z) {
            if (profileTracker != null) {
                profileTracker.startTracking();
            }
        } else if (profileTracker != null) {
            profileTracker.stopTracking();
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return ProfilePictureView.TAG;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePictureView(Context context) {
        super(context);
        context.getClass();
        this.image = new ImageView(getContext());
        this.isCropped = IS_CROPPED_DEFAULT_VALUE;
        this.presetSize = -1;
        initialize();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        attributeSet.getClass();
        this.image = new ImageView(getContext());
        this.isCropped = IS_CROPPED_DEFAULT_VALUE;
        this.presetSize = -1;
        initialize();
        parseAttributes(attributeSet);
    }
}
