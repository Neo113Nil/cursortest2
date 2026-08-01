package V;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import q1.l;

/* loaded from: classes.dex */
public final class f extends l {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f776a;

    /* renamed from: b, reason: collision with root package name */
    public final d f777b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f778c = true;

    public f(TextView textView) {
        this.f776a = textView;
        this.f777b = new d(textView);
    }

    @Override // q1.l
    public final void U(boolean z2) {
        if (z2) {
            d0();
        }
    }

    @Override // q1.l
    public final void V(boolean z2) {
        this.f778c = z2;
        d0();
        TextView textView = this.f776a;
        textView.setFilters(x(textView.getFilters()));
    }

    public final void d0() {
        TextView textView = this.f776a;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f778c) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new j(transformationMethod);
            }
        } else if (transformationMethod instanceof j) {
            transformationMethod = ((j) transformationMethod).f784a;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // q1.l
    public final InputFilter[] x(InputFilter[] inputFilterArr) {
        if (!this.f778c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof d) {
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
            d dVar = this.f777b;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == dVar) {
                return inputFilterArr;
            }
            i4++;
        }
    }
}
