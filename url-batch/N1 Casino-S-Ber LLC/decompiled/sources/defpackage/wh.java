package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class wh extends e70 {
    public final TextView i;
    public final sh j;
    public boolean k = true;

    public wh(TextView textView) {
        this.i = textView;
        this.j = new sh(textView);
    }

    @Override // defpackage.e70
    public final InputFilter[] A(InputFilter[] inputFilterArr) {
        if (!this.k) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof sh) {
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
            sh shVar = this.j;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = shVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == shVar) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // defpackage.e70
    public final void P(boolean z) {
        if (z) {
            b0();
        }
    }

    @Override // defpackage.e70
    public final void Q(boolean z) {
        this.k = z;
        b0();
        TextView textView = this.i;
        textView.setFilters(A(textView.getFilters()));
    }

    public final void b0() {
        TextView textView = this.i;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.k) {
            if (!(transformationMethod instanceof ai) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new ai(transformationMethod);
            }
        } else if (transformationMethod instanceof ai) {
            transformationMethod = ((ai) transformationMethod).f;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
