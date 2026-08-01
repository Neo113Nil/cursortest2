package X;

import H1.l;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f extends l {

    /* renamed from: f, reason: collision with root package name */
    public final TextView f1357f;

    /* renamed from: g, reason: collision with root package name */
    public final d f1358g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1359h = true;

    public f(TextView textView) {
        this.f1357f = textView;
        this.f1358g = new d(textView);
    }

    @Override // H1.l
    public final boolean E() {
        return this.f1359h;
    }

    @Override // H1.l
    public final void V(boolean z2) {
        if (z2) {
            TextView textView = this.f1357f;
            textView.setTransformationMethod(j0(textView.getTransformationMethod()));
        }
    }

    @Override // H1.l
    public final void X(boolean z2) {
        this.f1359h = z2;
        TextView textView = this.f1357f;
        textView.setTransformationMethod(j0(textView.getTransformationMethod()));
        textView.setFilters(x(textView.getFilters()));
    }

    @Override // H1.l
    public final TransformationMethod j0(TransformationMethod transformationMethod) {
        return this.f1359h ? ((transformationMethod instanceof j) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new j(transformationMethod) : transformationMethod instanceof j ? ((j) transformationMethod).f1366a : transformationMethod;
    }

    @Override // H1.l
    public final InputFilter[] x(InputFilter[] inputFilterArr) {
        if (!this.f1359h) {
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
            d dVar = this.f1358g;
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
