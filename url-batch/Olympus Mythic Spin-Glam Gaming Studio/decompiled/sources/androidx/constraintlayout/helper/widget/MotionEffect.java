package androidx.constraintlayout.helper.widget;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.KeyAttributes;
import androidx.constraintlayout.motion.widget.KeyPosition;
import androidx.constraintlayout.motion.widget.MotionController;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class MotionEffect extends MotionHelper {
    private int fadeMove;
    private float motionEffectAlpha;
    private int motionEffectEnd;
    private int motionEffectStart;
    private boolean motionEffectStrictMove;
    private int motionEffectTranslationX;
    private int motionEffectTranslationY;
    private int viewTransitionId;

    @Override // androidx.constraintlayout.motion.widget.MotionHelper
    public boolean isDecorator() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0189, code lost:
    
        if (r14 == 0.0f) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x019d, code lost:
    
        if (r14 == 0.0f) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ad, code lost:
    
        if (r15 == 0.0f) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01bd, code lost:
    
        if (r15 == 0.0f) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e8  */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPreSetup(MotionLayout motionLayout, HashMap hashMap) {
        KeyAttributes keyAttributes;
        KeyAttributes keyAttributes2;
        KeyAttributes keyAttributes3;
        int i;
        HashMap hashMap2 = hashMap;
        View[] views = getViews((ConstraintLayout) getParent());
        if (views == null) {
            Log.v("FadeMove", Debug.getLoc() + " views = null");
            return;
        }
        KeyAttributes keyAttributes4 = new KeyAttributes();
        KeyAttributes keyAttributes5 = new KeyAttributes();
        keyAttributes4.setValue("alpha", Float.valueOf(this.motionEffectAlpha));
        keyAttributes5.setValue("alpha", Float.valueOf(this.motionEffectAlpha));
        keyAttributes4.setFramePosition(this.motionEffectStart);
        keyAttributes5.setFramePosition(this.motionEffectEnd);
        KeyPosition keyPosition = new KeyPosition();
        keyPosition.setFramePosition(this.motionEffectStart);
        keyPosition.setType(0);
        keyPosition.setValue("percentX", 0);
        keyPosition.setValue("percentY", 0);
        KeyPosition keyPosition2 = new KeyPosition();
        keyPosition2.setFramePosition(this.motionEffectEnd);
        keyPosition2.setType(0);
        keyPosition2.setValue("percentX", 1);
        keyPosition2.setValue("percentY", 1);
        KeyAttributes keyAttributes6 = null;
        if (this.motionEffectTranslationX > 0) {
            keyAttributes = new KeyAttributes();
            keyAttributes2 = new KeyAttributes();
            keyAttributes.setValue("translationX", Integer.valueOf(this.motionEffectTranslationX));
            keyAttributes.setFramePosition(this.motionEffectEnd);
            keyAttributes2.setValue("translationX", 0);
            keyAttributes2.setFramePosition(this.motionEffectEnd - 1);
        } else {
            keyAttributes = null;
            keyAttributes2 = null;
        }
        if (this.motionEffectTranslationY > 0) {
            keyAttributes6 = new KeyAttributes();
            keyAttributes3 = new KeyAttributes();
            keyAttributes6.setValue("translationY", Integer.valueOf(this.motionEffectTranslationY));
            keyAttributes6.setFramePosition(this.motionEffectEnd);
            keyAttributes3.setValue("translationY", 0);
            keyAttributes3.setFramePosition(this.motionEffectEnd - 1);
        } else {
            keyAttributes3 = null;
        }
        int i2 = this.fadeMove;
        if (i2 == -1) {
            int[] iArr = new int[4];
            for (View view : views) {
                MotionController motionController = (MotionController) hashMap2.get(view);
                if (motionController != null) {
                    float finalX = motionController.getFinalX() - motionController.getStartX();
                    float finalY = motionController.getFinalY() - motionController.getStartY();
                    if (finalY < 0.0f) {
                        iArr[1] = iArr[1] + 1;
                    }
                    if (finalY > 0.0f) {
                        iArr[0] = iArr[0] + 1;
                    }
                    if (finalX > 0.0f) {
                        iArr[3] = iArr[3] + 1;
                    }
                    if (finalX < 0.0f) {
                        iArr[2] = iArr[2] + 1;
                    }
                }
            }
            int i3 = iArr[0];
            i2 = 0;
            for (int i4 = 1; i4 < 4; i4++) {
                int i5 = iArr[i4];
                if (i3 < i5) {
                    i3 = i5;
                    i2 = i4;
                }
            }
        }
        int i6 = 0;
        while (i6 < views.length) {
            MotionController motionController2 = (MotionController) hashMap2.get(views[i6]);
            if (motionController2 != null) {
                float finalX2 = motionController2.getFinalX() - motionController2.getStartX();
                float finalY2 = motionController2.getFinalY() - motionController2.getStartY();
                if (i2 == 0) {
                    if (finalY2 > 0.0f) {
                        if (this.motionEffectStrictMove) {
                        }
                    }
                    i = this.viewTransitionId;
                    if (i != -1) {
                        motionController2.addKey(keyAttributes4);
                        motionController2.addKey(keyAttributes5);
                        motionController2.addKey(keyPosition);
                        motionController2.addKey(keyPosition2);
                        if (this.motionEffectTranslationX > 0) {
                            motionController2.addKey(keyAttributes);
                            motionController2.addKey(keyAttributes2);
                        }
                        if (this.motionEffectTranslationY > 0) {
                            motionController2.addKey(keyAttributes6);
                            motionController2.addKey(keyAttributes3);
                        }
                    } else {
                        motionLayout.applyViewTransition(i, motionController2);
                    }
                } else if (i2 == 1) {
                    if (finalY2 < 0.0f) {
                        if (this.motionEffectStrictMove) {
                        }
                    }
                    i = this.viewTransitionId;
                    if (i != -1) {
                    }
                } else if (i2 == 2) {
                    if (finalX2 < 0.0f) {
                        if (this.motionEffectStrictMove) {
                        }
                    }
                    i = this.viewTransitionId;
                    if (i != -1) {
                    }
                } else {
                    if (i2 == 3) {
                        if (finalX2 > 0.0f) {
                            if (this.motionEffectStrictMove) {
                            }
                        }
                    }
                    i = this.viewTransitionId;
                    if (i != -1) {
                    }
                }
                i6++;
                hashMap2 = hashMap;
            }
            i6++;
            hashMap2 = hashMap;
        }
    }
}
