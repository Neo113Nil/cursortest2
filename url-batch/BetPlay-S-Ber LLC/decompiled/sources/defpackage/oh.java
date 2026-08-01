package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class oh extends vw {
    public final TextView o;
    public final kh p;
    public boolean q = true;

    public oh(TextView textView) {
        this.o = textView;
        this.p = new kh(textView);
    }

    @Override // defpackage.vw
    public final InputFilter[] B(InputFilter[] inputFilterArr) {
        if (!this.q) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof kh) {
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
            kh khVar = this.p;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = khVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == khVar) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // defpackage.vw
    public final void g0(boolean z) {
        if (z) {
            s0();
        }
    }

    @Override // defpackage.vw
    public final void h0(boolean z) {
        this.q = z;
        s0();
        TextView textView = this.o;
        textView.setFilters(B(textView.getFilters()));
    }

    public final void s0() {
        TextView textView = this.o;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.q) {
            if (!(transformationMethod instanceof sh) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new sh(transformationMethod);
            }
        } else if (transformationMethod instanceof sh) {
            transformationMethod = ((sh) transformationMethod).f;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
