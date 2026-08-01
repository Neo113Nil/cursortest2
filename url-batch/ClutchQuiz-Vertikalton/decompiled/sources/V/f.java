package V;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f extends T.d {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f876a;

    /* renamed from: b, reason: collision with root package name */
    public final d f877b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f878c = true;

    public f(TextView textView) {
        this.f876a = textView;
        this.f877b = new d(textView);
    }

    @Override // T.d
    public final void O(boolean z2) {
        if (z2) {
            S();
        }
    }

    @Override // T.d
    public final void P(boolean z2) {
        this.f878c = z2;
        S();
        TextView textView = this.f876a;
        textView.setFilters(v(textView.getFilters()));
    }

    public final void S() {
        TextView textView = this.f876a;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f878c) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new j(transformationMethod);
            }
        } else if (transformationMethod instanceof j) {
            transformationMethod = ((j) transformationMethod).f884a;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // T.d
    public final InputFilter[] v(InputFilter[] inputFilterArr) {
        if (!this.f878c) {
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
            d dVar = this.f877b;
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
