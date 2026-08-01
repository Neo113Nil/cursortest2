package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class nm extends d50 {
    public final TextView k;
    public final im l;
    public boolean m = true;

    public nm(TextView textView) {
        this.k = textView;
        this.l = new im(textView);
    }

    @Override // defpackage.d50
    public final void V(boolean z) {
        if (z) {
            h0();
        }
    }

    @Override // defpackage.d50
    public final void X(boolean z) {
        this.m = z;
        h0();
        TextView textView = this.k;
        textView.setFilters(w(textView.getFilters()));
    }

    public final void h0() {
        TextView textView = this.k;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.m) {
            if (!(transformationMethod instanceof rm) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new rm(transformationMethod);
            }
        } else if (transformationMethod instanceof rm) {
            transformationMethod = ((rm) transformationMethod).f;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // defpackage.d50
    public final InputFilter[] w(InputFilter[] inputFilterArr) {
        if (!this.m) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof im) {
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
            im imVar = this.l;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = imVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == imVar) {
                return inputFilterArr;
            }
            i4++;
        }
    }
}
