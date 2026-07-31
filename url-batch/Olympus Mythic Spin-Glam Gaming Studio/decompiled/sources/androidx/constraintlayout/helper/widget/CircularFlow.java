package androidx.constraintlayout.helper.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;

/* loaded from: classes13.dex */
public class CircularFlow extends VirtualLayout {
    private static float DEFAULT_ANGLE;
    private static int DEFAULT_RADIUS;
    private float[] mAngles;
    ConstraintLayout mContainer;
    private int mCountAngle;
    private int mCountRadius;
    private int[] mRadius;
    private String mReferenceAngles;
    private Float mReferenceDefaultAngle;
    private Integer mReferenceDefaultRadius;
    private String mReferenceRadius;
    int mViewCenter;

    public int[] getRadius() {
        return Arrays.copyOf(this.mRadius, this.mCountRadius);
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.mAngles, this.mCountAngle);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    protected void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_Layout_circularflow_viewCenter) {
                    this.mViewCenter = obtainStyledAttributes.getResourceId(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_angles) {
                    String string = obtainStyledAttributes.getString(index);
                    this.mReferenceAngles = string;
                    setAngles(string);
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_radiusInDP) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.mReferenceRadius = string2;
                    setRadius(string2);
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_defaultAngle) {
                    Float valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, DEFAULT_ANGLE));
                    this.mReferenceDefaultAngle = valueOf;
                    setDefaultAngle(valueOf.floatValue());
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_defaultRadius) {
                    Integer valueOf2 = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, DEFAULT_RADIUS));
                    this.mReferenceDefaultRadius = valueOf2;
                    setDefaultRadius(valueOf2.intValue());
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.mReferenceAngles;
        if (str != null) {
            this.mAngles = new float[1];
            setAngles(str);
        }
        String str2 = this.mReferenceRadius;
        if (str2 != null) {
            this.mRadius = new int[1];
            setRadius(str2);
        }
        Float f = this.mReferenceDefaultAngle;
        if (f != null) {
            setDefaultAngle(f.floatValue());
        }
        Integer num = this.mReferenceDefaultRadius;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        anchorReferences();
    }

    private void anchorReferences() {
        this.mContainer = (ConstraintLayout) getParent();
        for (int i = 0; i < this.mCount; i++) {
            View viewById = this.mContainer.getViewById(this.mIds[i]);
            if (viewById != null) {
                int i2 = DEFAULT_RADIUS;
                float f = DEFAULT_ANGLE;
                int[] iArr = this.mRadius;
                if (iArr != null && i < iArr.length) {
                    i2 = iArr[i];
                } else {
                    Integer num = this.mReferenceDefaultRadius;
                    if (num == null || num.intValue() == -1) {
                        Log.e("CircularFlow", "Added radius to view with id: " + ((String) this.mMap.get(Integer.valueOf(viewById.getId()))));
                    } else {
                        this.mCountRadius++;
                        if (this.mRadius == null) {
                            this.mRadius = new int[1];
                        }
                        int[] radius = getRadius();
                        this.mRadius = radius;
                        radius[this.mCountRadius - 1] = i2;
                    }
                }
                float[] fArr = this.mAngles;
                if (fArr != null && i < fArr.length) {
                    f = fArr[i];
                } else {
                    Float f2 = this.mReferenceDefaultAngle;
                    if (f2 == null || f2.floatValue() == -1.0f) {
                        Log.e("CircularFlow", "Added angle to view with id: " + ((String) this.mMap.get(Integer.valueOf(viewById.getId()))));
                    } else {
                        this.mCountAngle++;
                        if (this.mAngles == null) {
                            this.mAngles = new float[1];
                        }
                        float[] angles = getAngles();
                        this.mAngles = angles;
                        angles[this.mCountAngle - 1] = f;
                    }
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) viewById.getLayoutParams();
                layoutParams.circleAngle = f;
                layoutParams.circleConstraint = this.mViewCenter;
                layoutParams.circleRadius = i2;
                viewById.setLayoutParams(layoutParams);
            }
        }
        applyLayoutFeatures();
    }

    public void setDefaultAngle(float f) {
        DEFAULT_ANGLE = f;
    }

    public void setDefaultRadius(int i) {
        DEFAULT_RADIUS = i;
    }

    private void setAngles(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.mCountAngle = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                addAngle(str.substring(i).trim());
                return;
            } else {
                addAngle(str.substring(i, indexOf).trim());
                i = indexOf + 1;
            }
        }
    }

    private void setRadius(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.mCountRadius = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                addRadius(str.substring(i).trim());
                return;
            } else {
                addRadius(str.substring(i, indexOf).trim());
                i = indexOf + 1;
            }
        }
    }

    private void addAngle(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.myContext == null || (fArr = this.mAngles) == null) {
            return;
        }
        if (this.mCountAngle + 1 > fArr.length) {
            this.mAngles = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.mAngles[this.mCountAngle] = Integer.parseInt(str);
        this.mCountAngle++;
    }

    private void addRadius(String str) {
        int[] iArr;
        if (str == null || str.length() == 0 || this.myContext == null || (iArr = this.mRadius) == null) {
            return;
        }
        if (this.mCountRadius + 1 > iArr.length) {
            this.mRadius = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.mRadius[this.mCountRadius] = (int) (Integer.parseInt(str) * this.myContext.getResources().getDisplayMetrics().density);
        this.mCountRadius++;
    }
}
