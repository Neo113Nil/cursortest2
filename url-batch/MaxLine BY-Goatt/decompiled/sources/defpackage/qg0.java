package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qg0 extends tk3 {
    public final TextView r;
    public final jg0 s;
    public boolean t = true;

    public qg0(TextView textView) {
        this.r = textView;
        this.s = new jg0(textView);
    }

    @Override // defpackage.tk3
    public final InputFilter[] O(InputFilter[] inputFilterArr) {
        if (!this.t) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof jg0) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            jg0 jg0Var = this.s;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = jg0Var;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == jg0Var) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // defpackage.tk3
    public final void d0(boolean z) {
        if (z) {
            n0();
        }
    }

    @Override // defpackage.tk3
    public final void e0(boolean z) {
        this.t = z;
        n0();
        TextView textView = this.r;
        textView.setFilters(O(textView.getFilters()));
    }

    public final void n0() {
        TextView textView = this.r;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.t) {
            if (!(transformationMethod instanceof ug0) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new ug0(transformationMethod);
            }
        } else if (transformationMethod instanceof ug0) {
            transformationMethod = ((ug0) transformationMethod).m;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
