package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class zj extends kr {
    public final TextView o;
    public final uj p;
    public boolean q = true;

    public zj(TextView textView) {
        this.o = textView;
        this.p = new uj(textView);
    }

    @Override // defpackage.kr
    public final void a0(boolean z) {
        if (z) {
            i0();
        }
    }

    @Override // defpackage.kr
    public final void b0(boolean z) {
        this.q = z;
        i0();
        TextView textView = this.o;
        textView.setFilters(z(textView.getFilters()));
    }

    public final void i0() {
        TextView textView = this.o;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.q) {
            if (!(transformationMethod instanceof dk) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new dk(transformationMethod);
            }
        } else if (transformationMethod instanceof dk) {
            transformationMethod = ((dk) transformationMethod).f;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // defpackage.kr
    public final InputFilter[] z(InputFilter[] inputFilterArr) {
        if (!this.q) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof uj) {
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
            uj ujVar = this.p;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = ujVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == ujVar) {
                return inputFilterArr;
            }
            i4++;
        }
    }
}
