package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes4.dex */
class TouchResponse {
    private float mLastTouchX;
    private float mLastTouchY;
    private final MotionLayout mMotionLayout;
    private static final float[][] TOUCH_SIDES = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    private static final float[][] TOUCH_DIRECTION = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    private int mTouchAnchorSide = 0;
    private int mTouchSide = 0;
    private int mOnTouchUp = 0;
    private int mTouchAnchorId = -1;
    private int mTouchRegionId = -1;
    private int mLimitBoundsTo = -1;
    private float mTouchAnchorY = 0.5f;
    private float mTouchAnchorX = 0.5f;
    float mRotateCenterX = 0.5f;
    float mRotateCenterY = 0.5f;
    private int mRotationCenterId = -1;
    boolean mIsRotateMode = false;
    private float mTouchDirectionX = 0.0f;
    private float mTouchDirectionY = 1.0f;
    private boolean mDragStarted = false;
    private float[] mAnchorDpDt = new float[2];
    private int[] mTempLoc = new int[2];
    private float mMaxVelocity = 4.0f;
    private float mMaxAcceleration = 1.2f;
    private boolean mMoveWhenScrollAtTop = true;
    private float mDragScale = 1.0f;
    private int mFlags = 0;
    private float mDragThreshold = 10.0f;
    private float mSpringDamping = 10.0f;
    private float mSpringMass = 1.0f;
    private float mSpringStiffness = Float.NaN;
    private float mSpringStopThreshold = Float.NaN;
    private int mSpringBoundary = 0;
    private int mAutoCompleteMode = 0;

    TouchResponse(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.mMotionLayout = motionLayout;
        fillFromAttributeList(context, Xml.asAttributeSet(xmlPullParser));
    }

    public void setRTL(boolean z) {
        if (z) {
            float[][] fArr = TOUCH_DIRECTION;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = TOUCH_SIDES;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = TOUCH_DIRECTION;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = TOUCH_SIDES;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = TOUCH_SIDES[this.mTouchAnchorSide];
        this.mTouchAnchorX = fArr5[0];
        this.mTouchAnchorY = fArr5[1];
        int i = this.mTouchSide;
        float[][] fArr6 = TOUCH_DIRECTION;
        if (i >= fArr6.length) {
            return;
        }
        float[] fArr7 = fArr6[i];
        this.mTouchDirectionX = fArr7[0];
        this.mTouchDirectionY = fArr7[1];
    }

    private void fillFromAttributeList(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.OnSwipe);
        fill(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    private void fill(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == R.styleable.OnSwipe_touchAnchorId) {
                this.mTouchAnchorId = typedArray.getResourceId(index, this.mTouchAnchorId);
            } else if (index == R.styleable.OnSwipe_touchAnchorSide) {
                int i2 = typedArray.getInt(index, this.mTouchAnchorSide);
                this.mTouchAnchorSide = i2;
                float[] fArr = TOUCH_SIDES[i2];
                this.mTouchAnchorX = fArr[0];
                this.mTouchAnchorY = fArr[1];
            } else if (index == R.styleable.OnSwipe_dragDirection) {
                int i3 = typedArray.getInt(index, this.mTouchSide);
                this.mTouchSide = i3;
                float[][] fArr2 = TOUCH_DIRECTION;
                if (i3 < fArr2.length) {
                    float[] fArr3 = fArr2[i3];
                    this.mTouchDirectionX = fArr3[0];
                    this.mTouchDirectionY = fArr3[1];
                } else {
                    this.mTouchDirectionY = Float.NaN;
                    this.mTouchDirectionX = Float.NaN;
                    this.mIsRotateMode = true;
                }
            } else if (index == R.styleable.OnSwipe_maxVelocity) {
                this.mMaxVelocity = typedArray.getFloat(index, this.mMaxVelocity);
            } else if (index == R.styleable.OnSwipe_maxAcceleration) {
                this.mMaxAcceleration = typedArray.getFloat(index, this.mMaxAcceleration);
            } else if (index == R.styleable.OnSwipe_moveWhenScrollAtTop) {
                this.mMoveWhenScrollAtTop = typedArray.getBoolean(index, this.mMoveWhenScrollAtTop);
            } else if (index == R.styleable.OnSwipe_dragScale) {
                this.mDragScale = typedArray.getFloat(index, this.mDragScale);
            } else if (index == R.styleable.OnSwipe_dragThreshold) {
                this.mDragThreshold = typedArray.getFloat(index, this.mDragThreshold);
            } else if (index == R.styleable.OnSwipe_touchRegionId) {
                this.mTouchRegionId = typedArray.getResourceId(index, this.mTouchRegionId);
            } else if (index == R.styleable.OnSwipe_onTouchUp) {
                this.mOnTouchUp = typedArray.getInt(index, this.mOnTouchUp);
            } else if (index == R.styleable.OnSwipe_nestedScrollFlags) {
                this.mFlags = typedArray.getInteger(index, 0);
            } else if (index == R.styleable.OnSwipe_limitBoundsTo) {
                this.mLimitBoundsTo = typedArray.getResourceId(index, 0);
            } else if (index == R.styleable.OnSwipe_rotationCenterId) {
                this.mRotationCenterId = typedArray.getResourceId(index, this.mRotationCenterId);
            } else if (index == R.styleable.OnSwipe_springDamping) {
                this.mSpringDamping = typedArray.getFloat(index, this.mSpringDamping);
            } else if (index == R.styleable.OnSwipe_springMass) {
                this.mSpringMass = typedArray.getFloat(index, this.mSpringMass);
            } else if (index == R.styleable.OnSwipe_springStiffness) {
                this.mSpringStiffness = typedArray.getFloat(index, this.mSpringStiffness);
            } else if (index == R.styleable.OnSwipe_springStopThreshold) {
                this.mSpringStopThreshold = typedArray.getFloat(index, this.mSpringStopThreshold);
            } else if (index == R.styleable.OnSwipe_springBoundary) {
                this.mSpringBoundary = typedArray.getInt(index, this.mSpringBoundary);
            } else if (index == R.styleable.OnSwipe_autoCompleteMode) {
                this.mAutoCompleteMode = typedArray.getInt(index, this.mAutoCompleteMode);
            }
        }
    }

    void setUpTouchEvent(float f, float f2) {
        this.mLastTouchX = f;
        this.mLastTouchY = f2;
        this.mDragStarted = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0294  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void processTouchRotateEvent(MotionEvent motionEvent, MotionLayout.MotionTracker motionTracker, int i, MotionScene motionScene) {
        float left;
        float f;
        int top;
        int bottom;
        int i2;
        float f2;
        int i3;
        motionTracker.addMovement(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mLastTouchX = motionEvent.getRawX();
            this.mLastTouchY = motionEvent.getRawY();
            this.mDragStarted = false;
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            motionEvent.getRawY();
            motionEvent.getRawX();
            float width = this.mMotionLayout.getWidth() / 2.0f;
            float height = this.mMotionLayout.getHeight() / 2.0f;
            int i4 = this.mRotationCenterId;
            if (i4 != -1) {
                View findViewById = this.mMotionLayout.findViewById(i4);
                this.mMotionLayout.getLocationOnScreen(this.mTempLoc);
                height = ((findViewById.getTop() + findViewById.getBottom()) / 2.0f) + this.mTempLoc[1];
                width = this.mTempLoc[0] + ((findViewById.getLeft() + findViewById.getRight()) / 2.0f);
            } else {
                int i5 = this.mTouchAnchorId;
                if (i5 != -1) {
                    if (this.mMotionLayout.findViewById(this.mMotionLayout.getMotionController(i5).getAnimateRelativeTo()) == null) {
                        Log.e("TouchResponse", "could not find view to animate to");
                    } else {
                        this.mMotionLayout.getLocationOnScreen(this.mTempLoc);
                        width = this.mTempLoc[0] + ((r12.getLeft() + r12.getRight()) / 2.0f);
                        height = this.mTempLoc[1] + ((r12.getTop() + r12.getBottom()) / 2.0f);
                    }
                }
            }
            float rawX = motionEvent.getRawX() - width;
            float rawY = motionEvent.getRawY() - height;
            float atan2 = (float) (((Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width) - Math.atan2(this.mLastTouchY - height, this.mLastTouchX - width)) * 180.0d) / 3.141592653589793d);
            if (atan2 > 330.0f) {
                atan2 -= 360.0f;
            } else if (atan2 < -330.0f) {
                atan2 += 360.0f;
            }
            if (Math.abs(atan2) > 0.01d || this.mDragStarted) {
                float progress = this.mMotionLayout.getProgress();
                if (!this.mDragStarted) {
                    this.mDragStarted = true;
                    this.mMotionLayout.setProgress(progress);
                }
                int i6 = this.mTouchAnchorId;
                if (i6 != -1) {
                    this.mMotionLayout.getAnchorDpDt(i6, progress, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
                    this.mAnchorDpDt[1] = (float) Math.toDegrees(r3[1]);
                } else {
                    this.mAnchorDpDt[1] = 360.0f;
                }
                float max = Math.max(Math.min(progress + ((atan2 * this.mDragScale) / this.mAnchorDpDt[1]), 1.0f), 0.0f);
                float progress2 = this.mMotionLayout.getProgress();
                if (max != progress2) {
                    if (progress2 == 0.0f || progress2 == 1.0f) {
                        this.mMotionLayout.endTrigger(progress2 == 0.0f);
                    }
                    this.mMotionLayout.setProgress(max);
                    motionTracker.computeCurrentVelocity(1000);
                    float xVelocity = motionTracker.getXVelocity();
                    double yVelocity = motionTracker.getYVelocity();
                    double d = xVelocity;
                    this.mMotionLayout.mLastVelocity = (float) Math.toDegrees((float) ((Math.hypot(yVelocity, d) * Math.sin(Math.atan2(yVelocity, d) - r8)) / Math.hypot(rawX, rawY)));
                } else {
                    this.mMotionLayout.mLastVelocity = 0.0f;
                }
                this.mLastTouchX = motionEvent.getRawX();
                this.mLastTouchY = motionEvent.getRawY();
                return;
            }
            return;
        }
        this.mDragStarted = false;
        motionTracker.computeCurrentVelocity(16);
        float xVelocity2 = motionTracker.getXVelocity();
        float yVelocity2 = motionTracker.getYVelocity();
        float progress3 = this.mMotionLayout.getProgress();
        float width2 = this.mMotionLayout.getWidth() / 2.0f;
        float height2 = this.mMotionLayout.getHeight() / 2.0f;
        int i7 = this.mRotationCenterId;
        if (i7 != -1) {
            View findViewById2 = this.mMotionLayout.findViewById(i7);
            this.mMotionLayout.getLocationOnScreen(this.mTempLoc);
            left = this.mTempLoc[0] + ((findViewById2.getLeft() + findViewById2.getRight()) / 2.0f);
            f = this.mTempLoc[1];
            top = findViewById2.getTop();
            bottom = findViewById2.getBottom();
        } else {
            int i8 = this.mTouchAnchorId;
            if (i8 != -1) {
                View findViewById3 = this.mMotionLayout.findViewById(this.mMotionLayout.getMotionController(i8).getAnimateRelativeTo());
                this.mMotionLayout.getLocationOnScreen(this.mTempLoc);
                left = this.mTempLoc[0] + ((findViewById3.getLeft() + findViewById3.getRight()) / 2.0f);
                f = this.mTempLoc[1];
                top = findViewById3.getTop();
                bottom = findViewById3.getBottom();
            }
            float rawX2 = motionEvent.getRawX() - width2;
            double degrees = Math.toDegrees(Math.atan2(motionEvent.getRawY() - height2, rawX2));
            i2 = this.mTouchAnchorId;
            if (i2 == -1) {
                this.mMotionLayout.getAnchorDpDt(i2, progress3, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
                this.mAnchorDpDt[1] = (float) Math.toDegrees(r3[1]);
            } else {
                this.mAnchorDpDt[1] = 360.0f;
            }
            float degrees2 = ((float) (Math.toDegrees(Math.atan2(yVelocity2 + r2, xVelocity2 + rawX2)) - degrees)) * 62.5f;
            f2 = Float.isNaN(degrees2) ? (((degrees2 * 3.0f) * this.mDragScale) / this.mAnchorDpDt[1]) + progress3 : progress3;
            if (f2 != 0.0f || f2 == 1.0f || (i3 = this.mOnTouchUp) == 3) {
                if (0.0f < f2 || 1.0f <= f2) {
                    this.mMotionLayout.setState(MotionLayout.TransitionState.FINISHED);
                }
                return;
            }
            float f3 = (degrees2 * this.mDragScale) / this.mAnchorDpDt[1];
            float f4 = ((double) f2) < 0.5d ? 0.0f : 1.0f;
            if (i3 == 6) {
                if (progress3 + f3 < 0.0f) {
                    f3 = Math.abs(f3);
                }
                f4 = 1.0f;
            }
            if (this.mOnTouchUp == 7) {
                if (progress3 + f3 > 1.0f) {
                    f3 = -Math.abs(f3);
                }
                f4 = 0.0f;
            }
            this.mMotionLayout.touchAnimateTo(this.mOnTouchUp, f4, f3 * 3.0f);
            if (0.0f >= progress3 || 1.0f <= progress3) {
                this.mMotionLayout.setState(MotionLayout.TransitionState.FINISHED);
                return;
            }
            return;
        }
        height2 = f + ((top + bottom) / 2.0f);
        width2 = left;
        float rawX22 = motionEvent.getRawX() - width2;
        double degrees3 = Math.toDegrees(Math.atan2(motionEvent.getRawY() - height2, rawX22));
        i2 = this.mTouchAnchorId;
        if (i2 == -1) {
        }
        float degrees22 = ((float) (Math.toDegrees(Math.atan2(yVelocity2 + r2, xVelocity2 + rawX22)) - degrees3)) * 62.5f;
        if (Float.isNaN(degrees22)) {
        }
        if (f2 != 0.0f) {
        }
        if (0.0f < f2) {
        }
        this.mMotionLayout.setState(MotionLayout.TransitionState.FINISHED);
    }

    void processTouchEvent(MotionEvent motionEvent, MotionLayout.MotionTracker motionTracker, int i, MotionScene motionScene) {
        int i2;
        float f;
        if (this.mIsRotateMode) {
            processTouchRotateEvent(motionEvent, motionTracker, i, motionScene);
            return;
        }
        motionTracker.addMovement(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mLastTouchX = motionEvent.getRawX();
            this.mLastTouchY = motionEvent.getRawY();
            this.mDragStarted = false;
            return;
        }
        if (action == 1) {
            this.mDragStarted = false;
            motionTracker.computeCurrentVelocity(1000);
            float xVelocity = motionTracker.getXVelocity();
            float yVelocity = motionTracker.getYVelocity();
            float progress = this.mMotionLayout.getProgress();
            int i3 = this.mTouchAnchorId;
            if (i3 != -1) {
                this.mMotionLayout.getAnchorDpDt(i3, progress, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
            } else {
                float min = Math.min(this.mMotionLayout.getWidth(), this.mMotionLayout.getHeight());
                float[] fArr = this.mAnchorDpDt;
                fArr[1] = this.mTouchDirectionY * min;
                fArr[0] = min * this.mTouchDirectionX;
            }
            float f2 = this.mTouchDirectionX;
            float[] fArr2 = this.mAnchorDpDt;
            float f3 = f2 != 0.0f ? xVelocity / fArr2[0] : yVelocity / fArr2[1];
            float f4 = !Float.isNaN(f3) ? (f3 / 3.0f) + progress : progress;
            if (f4 == 0.0f || f4 == 1.0f || (i2 = this.mOnTouchUp) == 3) {
                if (0.0f >= f4 || 1.0f <= f4) {
                    this.mMotionLayout.setState(MotionLayout.TransitionState.FINISHED);
                    return;
                }
                return;
            }
            float f5 = ((double) f4) < 0.5d ? 0.0f : 1.0f;
            if (i2 == 6) {
                if (progress + f3 < 0.0f) {
                    f3 = Math.abs(f3);
                }
                f5 = 1.0f;
            }
            if (this.mOnTouchUp == 7) {
                if (progress + f3 > 1.0f) {
                    f3 = -Math.abs(f3);
                }
                f5 = 0.0f;
            }
            this.mMotionLayout.touchAnimateTo(this.mOnTouchUp, f5, f3);
            if (0.0f >= progress || 1.0f <= progress) {
                this.mMotionLayout.setState(MotionLayout.TransitionState.FINISHED);
                return;
            }
            return;
        }
        if (action != 2) {
            return;
        }
        float rawY = motionEvent.getRawY() - this.mLastTouchY;
        float rawX = motionEvent.getRawX() - this.mLastTouchX;
        if (Math.abs((this.mTouchDirectionX * rawX) + (this.mTouchDirectionY * rawY)) > this.mDragThreshold || this.mDragStarted) {
            float progress2 = this.mMotionLayout.getProgress();
            if (!this.mDragStarted) {
                this.mDragStarted = true;
                this.mMotionLayout.setProgress(progress2);
            }
            int i4 = this.mTouchAnchorId;
            if (i4 != -1) {
                this.mMotionLayout.getAnchorDpDt(i4, progress2, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
            } else {
                float min2 = Math.min(this.mMotionLayout.getWidth(), this.mMotionLayout.getHeight());
                float[] fArr3 = this.mAnchorDpDt;
                fArr3[1] = this.mTouchDirectionY * min2;
                fArr3[0] = min2 * this.mTouchDirectionX;
            }
            float f6 = this.mTouchDirectionX;
            float[] fArr4 = this.mAnchorDpDt;
            if (Math.abs(((f6 * fArr4[0]) + (this.mTouchDirectionY * fArr4[1])) * this.mDragScale) < 0.01d) {
                float[] fArr5 = this.mAnchorDpDt;
                fArr5[0] = 0.01f;
                fArr5[1] = 0.01f;
            }
            if (this.mTouchDirectionX != 0.0f) {
                f = rawX / this.mAnchorDpDt[0];
            } else {
                f = rawY / this.mAnchorDpDt[1];
            }
            float max = Math.max(Math.min(progress2 + f, 1.0f), 0.0f);
            if (this.mOnTouchUp == 6) {
                max = Math.max(max, 0.01f);
            }
            if (this.mOnTouchUp == 7) {
                max = Math.min(max, 0.99f);
            }
            float progress3 = this.mMotionLayout.getProgress();
            if (max != progress3) {
                if (progress3 == 0.0f || progress3 == 1.0f) {
                    this.mMotionLayout.endTrigger(progress3 == 0.0f);
                }
                this.mMotionLayout.setProgress(max);
                motionTracker.computeCurrentVelocity(1000);
                this.mMotionLayout.mLastVelocity = this.mTouchDirectionX != 0.0f ? motionTracker.getXVelocity() / this.mAnchorDpDt[0] : motionTracker.getYVelocity() / this.mAnchorDpDt[1];
            } else {
                this.mMotionLayout.mLastVelocity = 0.0f;
            }
            this.mLastTouchX = motionEvent.getRawX();
            this.mLastTouchY = motionEvent.getRawY();
        }
    }

    void setDown(float f, float f2) {
        this.mLastTouchX = f;
        this.mLastTouchY = f2;
    }

    float getProgressDirection(float f, float f2) {
        this.mMotionLayout.getAnchorDpDt(this.mTouchAnchorId, this.mMotionLayout.getProgress(), this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
        float f3 = this.mTouchDirectionX;
        if (f3 != 0.0f) {
            float[] fArr = this.mAnchorDpDt;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f * f3) / fArr[0];
        }
        float[] fArr2 = this.mAnchorDpDt;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f2 * this.mTouchDirectionY) / fArr2[1];
    }

    void scrollUp(float f, float f2) {
        this.mDragStarted = false;
        float progress = this.mMotionLayout.getProgress();
        this.mMotionLayout.getAnchorDpDt(this.mTouchAnchorId, progress, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
        float f3 = this.mTouchDirectionX;
        float[] fArr = this.mAnchorDpDt;
        float f4 = f3 != 0.0f ? (f * f3) / fArr[0] : (f2 * this.mTouchDirectionY) / fArr[1];
        if (!Float.isNaN(f4)) {
            progress += f4 / 3.0f;
        }
        if (progress != 0.0f) {
            boolean z = progress != 1.0f;
            int i = this.mOnTouchUp;
            if ((i != 3) && z) {
                this.mMotionLayout.touchAnimateTo(i, ((double) progress) >= 0.5d ? 1.0f : 0.0f, f4);
            }
        }
    }

    void scrollMove(float f, float f2) {
        float f3;
        float progress = this.mMotionLayout.getProgress();
        if (!this.mDragStarted) {
            this.mDragStarted = true;
            this.mMotionLayout.setProgress(progress);
        }
        this.mMotionLayout.getAnchorDpDt(this.mTouchAnchorId, progress, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
        float f4 = this.mTouchDirectionX;
        float[] fArr = this.mAnchorDpDt;
        if (Math.abs((f4 * fArr[0]) + (this.mTouchDirectionY * fArr[1])) < 0.01d) {
            float[] fArr2 = this.mAnchorDpDt;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f5 = this.mTouchDirectionX;
        if (f5 != 0.0f) {
            f3 = (f * f5) / this.mAnchorDpDt[0];
        } else {
            f3 = (f2 * this.mTouchDirectionY) / this.mAnchorDpDt[1];
        }
        float max = Math.max(Math.min(progress + f3, 1.0f), 0.0f);
        if (max != this.mMotionLayout.getProgress()) {
            this.mMotionLayout.setProgress(max);
        }
    }

    void setupTouch() {
        View view;
        int i = this.mTouchAnchorId;
        if (i != -1) {
            view = this.mMotionLayout.findViewById(i);
            if (view == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + Debug.getName(this.mMotionLayout.getContext(), this.mTouchAnchorId));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new View.OnTouchListener(this) { // from class: androidx.constraintlayout.motion.widget.TouchResponse.1
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view2, MotionEvent motionEvent) {
                    return false;
                }
            });
            nestedScrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener(this) { // from class: androidx.constraintlayout.motion.widget.TouchResponse.2
                @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
                public void onScrollChange(NestedScrollView nestedScrollView2, int i2, int i3, int i4, int i5) {
                }
            });
        }
    }

    float getMaxAcceleration() {
        return this.mMaxAcceleration;
    }

    public float getMaxVelocity() {
        return this.mMaxVelocity;
    }

    boolean getMoveWhenScrollAtTop() {
        return this.mMoveWhenScrollAtTop;
    }

    public int getAutoCompleteMode() {
        return this.mAutoCompleteMode;
    }

    RectF getTouchRegion(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.mTouchRegionId;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    int getTouchRegionId() {
        return this.mTouchRegionId;
    }

    RectF getLimitBoundsTo(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.mLimitBoundsTo;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    float dot(float f, float f2) {
        return (f * this.mTouchDirectionX) + (f2 * this.mTouchDirectionY);
    }

    public String toString() {
        if (Float.isNaN(this.mTouchDirectionX)) {
            return "rotation";
        }
        return this.mTouchDirectionX + " , " + this.mTouchDirectionY;
    }

    public int getFlags() {
        return this.mFlags;
    }

    public void setTouchUpMode(int i) {
        this.mOnTouchUp = i;
    }

    public float getSpringStiffness() {
        return this.mSpringStiffness;
    }

    public float getSpringMass() {
        return this.mSpringMass;
    }

    public float getSpringDamping() {
        return this.mSpringDamping;
    }

    public float getSpringStopThreshold() {
        return this.mSpringStopThreshold;
    }

    public int getSpringBoundary() {
        return this.mSpringBoundary;
    }

    boolean isDragStarted() {
        return this.mDragStarted;
    }
}
