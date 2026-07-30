package com.baidu.ar.arplay.core.pixel;

import com.baidu.ar.arplay.core.engine.rotate.Orientation;
import com.baidu.ar.arplay.core.pixel.PixelReadParams;
import com.baidu.ar.arplay.core.renderer.ARPRenderer;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class FramePixels {
    private int mHeight;
    private Orientation mOrientation;
    private PixelType mPixelType;
    private ByteBuffer mPixelsAddress;
    private long mTimestamp;
    private int mWidth;
    private boolean mCameraFrame = false;
    private boolean mFrontCamera = false;
    private int mDegree = 90;
    private int mPixelLength = 0;
    private int mTextureID = -1;
    private PixelReadParams.FrameType mFrameType = PixelReadParams.FrameType.STREAM_FRAME;

    /* renamed from: com.baidu.ar.arplay.core.pixel.FramePixels$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$baidu$ar$arplay$core$engine$rotate$Orientation;

        static {
            int[] iArr = new int[Orientation.values().length];
            $SwitchMap$com$baidu$ar$arplay$core$engine$rotate$Orientation = iArr;
            try {
                iArr[Orientation.PORTRAIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baidu$ar$arplay$core$engine$rotate$Orientation[Orientation.PORTRAIT_REVERSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baidu$ar$arplay$core$engine$rotate$Orientation[Orientation.LANDSCAPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baidu$ar$arplay$core$engine$rotate$Orientation[Orientation.LANDSCAPE_REVERSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public FramePixels(PixelType pixelType, ByteBuffer byteBuffer, int i8, int i9) {
        this.mPixelType = pixelType;
        this.mWidth = i8;
        this.mHeight = i9;
        this.mPixelsAddress = byteBuffer;
    }

    public int getDegree() {
        return this.mDegree;
    }

    public PixelReadParams.FrameType getFrameType() {
        return this.mFrameType;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public Orientation getOrientation() {
        return this.mOrientation;
    }

    public byte[] getPixelData() {
        int i8 = this.mPixelLength;
        byte[] bArr = new byte[i8];
        ARPRenderer.copyNativeBytebuffer(this.mPixelsAddress, bArr, 0, i8);
        return bArr;
    }

    public int getPixelLength() {
        return this.mPixelLength;
    }

    public PixelType getPixelType() {
        return this.mPixelType;
    }

    public ByteBuffer getPixelsAddress() {
        return this.mPixelsAddress;
    }

    public PixelRotation getSegOrientation() {
        PixelRotation pixelRotation = PixelRotation.NoRotation;
        int i8 = AnonymousClass1.$SwitchMap$com$baidu$ar$arplay$core$engine$rotate$Orientation[this.mOrientation.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                return isFrontCamera() ? PixelRotation.FlipVertical : PixelRotation.Rotate180;
            }
            if (i8 == 3) {
                return isFrontCamera() ? PixelRotation.RotateRightFlipVertical : PixelRotation.RotateLeft;
            }
            if (i8 == 4) {
                return isFrontCamera() ? PixelRotation.RotateRightFlipHorizontal : PixelRotation.RotateRight;
            }
            if (!isFrontCamera()) {
                return pixelRotation;
            }
        } else if (!isFrontCamera()) {
            return pixelRotation;
        }
        return PixelRotation.FlipHorizontal;
    }

    public int getTextureID() {
        return this.mTextureID;
    }

    public long getTimestamp() {
        return this.mTimestamp;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public boolean isCameraFrame() {
        return this.mCameraFrame;
    }

    public boolean isFrontCamera() {
        return this.mFrontCamera;
    }

    public void setCameraFrame(boolean z7) {
        this.mCameraFrame = z7;
    }

    public void setDegree(int i8) {
        this.mDegree = i8;
    }

    public void setFrameType(PixelReadParams.FrameType frameType) {
        this.mFrameType = frameType;
    }

    public void setFrontCamera(boolean z7) {
        this.mFrontCamera = z7;
    }

    public void setHeight(int i8) {
        this.mHeight = i8;
    }

    public void setOrientation(Orientation orientation) {
        this.mOrientation = orientation;
    }

    public void setPixelLength(int i8) {
        this.mPixelLength = i8;
    }

    public void setPixelType(PixelType pixelType) {
        this.mPixelType = pixelType;
    }

    public void setPixelsAddress(ByteBuffer byteBuffer) {
        this.mPixelsAddress = byteBuffer;
    }

    public void setTextureID(int i8) {
        this.mTextureID = i8;
    }

    public void setTimestamp(long j8) {
        this.mTimestamp = j8;
    }

    public void setWidth(int i8) {
        this.mWidth = i8;
    }
}
