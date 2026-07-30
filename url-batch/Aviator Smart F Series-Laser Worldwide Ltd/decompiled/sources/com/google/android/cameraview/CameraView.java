package com.google.android.cameraview;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.crrepa.band.my.device.customkey.util.c;
import com.google.android.cameraview.CameraViewImpl;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public class CameraView extends FrameLayout {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int FACING_BACK = 0;
    public static final int FACING_FRONT = 1;
    public static final int FLASH_AUTO = 3;
    public static final int FLASH_OFF = 0;
    public static final int FLASH_ON = 1;
    public static final int FLASH_RED_EYE = 4;
    public static final int FLASH_TORCH = 2;
    private static final String TAG = "CameraView";
    private boolean mAdjustViewBounds;
    private final CallbackBridge mCallbacks;
    private final DisplayOrientationDetector mDisplayOrientationDetector;
    CameraViewImpl mImpl;
    private PreviewImpl mPreviewImpl;

    public static abstract class Callback {
        public void onCameraClosed(CameraView cameraView) {
        }

        public void onCameraOpened(CameraView cameraView) {
        }

        public void onPictureTaken(CameraView cameraView, byte[] bArr) {
        }
    }

    private class CallbackBridge implements CameraViewImpl.Callback {
        private final ArrayList<Callback> mCallbacks = new ArrayList<>();
        private boolean mRequestLayoutOnOpen;

        CallbackBridge() {
        }

        public void add(Callback callback) {
            this.mCallbacks.add(callback);
        }

        @Override // com.google.android.cameraview.CameraViewImpl.Callback
        public void onCameraClosed() {
            Iterator<Callback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCameraClosed(CameraView.this);
            }
        }

        @Override // com.google.android.cameraview.CameraViewImpl.Callback
        public void onCameraOpened() {
            if (this.mRequestLayoutOnOpen) {
                this.mRequestLayoutOnOpen = false;
                CameraView.this.requestLayout();
            }
            Iterator<Callback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCameraOpened(CameraView.this);
            }
        }

        @Override // com.google.android.cameraview.CameraViewImpl.Callback
        public void onPictureTaken(byte[] bArr) {
            Iterator<Callback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onPictureTaken(CameraView.this, bArr);
            }
        }

        public void remove(Callback callback) {
            this.mCallbacks.remove(callback);
        }

        public void reserveRequestLayoutOnOpen() {
            this.mRequestLayoutOnOpen = true;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Facing {
    }

    public @interface Flash {
    }

    public CameraView(Context context) {
        this(context, null);
    }

    private CameraViewImpl createCameraViewImpl(Context context, PreviewImpl previewImpl, CallbackBridge callbackBridge) {
        if (!CameraHelper.getInstance(context).shouldUseCamera1()) {
            return Build.VERSION.SDK_INT < 23 ? new Camera2(callbackBridge, previewImpl, context) : new Camera2Api23(callbackBridge, previewImpl, context);
        }
        Log.e(TAG, "shouldUseCamera1");
        return new Camera1(callbackBridge, previewImpl);
    }

    @NonNull
    private PreviewImpl createPreviewImpl(Context context) {
        if (this.mPreviewImpl == null) {
            this.mPreviewImpl = new TextureViewPreview(context, this);
        }
        return this.mPreviewImpl;
    }

    public void addCallback(@NonNull Callback callback) {
        this.mCallbacks.add(callback);
    }

    public boolean getAdjustViewBounds() {
        return this.mAdjustViewBounds;
    }

    @Nullable
    public AspectRatio getAspectRatio() {
        return this.mImpl.getAspectRatio();
    }

    public boolean getAutoFocus() {
        return this.mImpl.getAutoFocus();
    }

    public int getFacing() {
        return this.mImpl.getFacing();
    }

    @Flash
    public int getFlash() {
        return this.mImpl.getFlash();
    }

    public Set<AspectRatio> getSupportedAspectRatios() {
        return this.mImpl.getSupportedAspectRatios();
    }

    public boolean isCameraOpened() {
        return this.mImpl.isCameraOpened();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.mDisplayOrientationDetector.enable(ViewCompat.getDisplay(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.mDisplayOrientationDetector.disable();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        if (isInEditMode()) {
            super.onMeasure(i8, i9);
            return;
        }
        if (!this.mAdjustViewBounds) {
            super.onMeasure(i8, i9);
        } else {
            if (!isCameraOpened()) {
                this.mCallbacks.reserveRequestLayoutOnOpen();
                super.onMeasure(i8, i9);
                return;
            }
            int mode = View.MeasureSpec.getMode(i8);
            int mode2 = View.MeasureSpec.getMode(i9);
            if (mode == 1073741824 && mode2 != 1073741824) {
                int size = (int) (View.MeasureSpec.getSize(i8) * getAspectRatio().toFloat());
                if (mode2 == Integer.MIN_VALUE) {
                    size = Math.min(size, View.MeasureSpec.getSize(i9));
                }
                super.onMeasure(i8, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
            } else if (mode == 1073741824 || mode2 != 1073741824) {
                super.onMeasure(i8, i9);
            } else {
                int size2 = (int) (View.MeasureSpec.getSize(i9) * getAspectRatio().toFloat());
                if (mode == Integer.MIN_VALUE) {
                    size2 = Math.min(size2, View.MeasureSpec.getSize(i8));
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), i9);
            }
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        AspectRatio aspectRatio = getAspectRatio();
        if (this.mDisplayOrientationDetector.getLastKnownDisplayOrientation() % c.MAX_GOAL_TIME == 0) {
            aspectRatio = aspectRatio.inverse();
        }
        if (measuredHeight < (aspectRatio.getY() * measuredWidth) / aspectRatio.getX()) {
            this.mImpl.getView().measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec((measuredWidth * aspectRatio.getY()) / aspectRatio.getX(), 1073741824));
        } else {
            this.mImpl.getView().measure(View.MeasureSpec.makeMeasureSpec((aspectRatio.getX() * measuredHeight) / aspectRatio.getY(), 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setFacing(savedState.facing);
        setAspectRatio(savedState.ratio);
        setAutoFocus(savedState.autoFocus);
        setFlash(savedState.flash);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.facing = getFacing();
        savedState.ratio = getAspectRatio();
        savedState.autoFocus = getAutoFocus();
        savedState.flash = getFlash();
        return savedState;
    }

    public void removeCallback(@NonNull Callback callback) {
        this.mCallbacks.remove(callback);
    }

    public void setAdjustViewBounds(boolean z7) {
        if (this.mAdjustViewBounds != z7) {
            this.mAdjustViewBounds = z7;
            requestLayout();
        }
    }

    public void setAspectRatio(@NonNull AspectRatio aspectRatio) {
        if (this.mImpl.setAspectRatio(aspectRatio)) {
            requestLayout();
        }
    }

    public void setAutoFocus(boolean z7) {
        this.mImpl.setAutoFocus(z7);
    }

    public void setFacing(int i8) {
        this.mImpl.setFacing(i8);
    }

    public void setFlash(@Flash int i8) {
        this.mImpl.setFlash(i8);
    }

    public void start() {
        if (this.mImpl.start()) {
            return;
        }
        Log.e(TAG, "Camera2 uses legacy hardware layer; fall back to Camera1");
        Parcelable onSaveInstanceState = onSaveInstanceState();
        this.mImpl = new Camera1(this.mCallbacks, createPreviewImpl(getContext()));
        onRestoreInstanceState(onSaveInstanceState);
        if (this.mImpl.start()) {
            Log.e(TAG, "start camera with Camera1 success, set to use Camera1 in the future");
            CameraHelper.getInstance(getContext()).setUseCamera1InFuture();
        }
    }

    public void stop() {
        this.mImpl.stop();
    }

    public void takePicture() {
        this.mImpl.takePicture();
    }

    public CameraView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CameraView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        if (isInEditMode()) {
            this.mCallbacks = null;
            this.mDisplayOrientationDetector = null;
            return;
        }
        PreviewImpl createPreviewImpl = createPreviewImpl(context);
        CallbackBridge callbackBridge = new CallbackBridge();
        this.mCallbacks = callbackBridge;
        this.mImpl = createCameraViewImpl(context, createPreviewImpl, callbackBridge);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CameraView, i8, R.style.Widget_CameraView);
        this.mAdjustViewBounds = obtainStyledAttributes.getBoolean(R.styleable.CameraView_android_adjustViewBounds, false);
        setFacing(obtainStyledAttributes.getInt(R.styleable.CameraView_facing, 0));
        String string = obtainStyledAttributes.getString(R.styleable.CameraView_aspectRatio);
        if (string != null) {
            setAspectRatio(AspectRatio.parse(string));
        } else {
            setAspectRatio(Constants.DEFAULT_ASPECT_RATIO);
        }
        setAutoFocus(obtainStyledAttributes.getBoolean(R.styleable.CameraView_autoFocus, true));
        setFlash(obtainStyledAttributes.getInt(R.styleable.CameraView_flash, 3));
        obtainStyledAttributes.recycle();
        this.mDisplayOrientationDetector = new DisplayOrientationDetector(context) { // from class: com.google.android.cameraview.CameraView.1
            @Override // com.google.android.cameraview.DisplayOrientationDetector
            public void onDisplayOrientationChanged(int i9) {
                CameraView.this.mImpl.setDisplayOrientation(i9);
            }
        };
    }

    protected static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.cameraview.CameraView.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i8) {
                return new SavedState[i8];
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, (ClassLoader) null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };
        boolean autoFocus;
        int facing;

        @Flash
        int flash;
        AspectRatio ratio;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            this.facing = parcel.readInt();
            this.ratio = (AspectRatio) parcel.readParcelable(classLoader);
            this.autoFocus = parcel.readByte() != 0;
            this.flash = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.facing);
            parcel.writeParcelable(this.ratio, 0);
            parcel.writeByte(this.autoFocus ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.flash);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
