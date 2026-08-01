package e4;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import m.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f extends a.a {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f3863a;

    /* renamed from: b, reason: collision with root package name */
    public final d f3864b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3865c = true;

    public f(c0 c0Var) {
        this.f3863a = c0Var;
        this.f3864b = new d(c0Var);
    }

    @Override // a.a
    public final InputFilter[] A(InputFilter[] inputFilterArr) {
        if (!this.f3865c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i3 = 0; i3 < inputFilterArr.length; i3++) {
                InputFilter inputFilter = inputFilterArr[i3];
                if (inputFilter instanceof d) {
                    sparseArray.put(i3, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArray.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i12 = 0;
        while (true) {
            d dVar = this.f3864b;
            if (i12 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i12] == dVar) {
                return inputFilterArr;
            }
            i12++;
        }
    }

    @Override // a.a
    public final void W(boolean z10) {
        if (z10) {
            i0();
        }
    }

    @Override // a.a
    public final void X(boolean z10) {
        this.f3865c = z10;
        i0();
        c0 c0Var = this.f3863a;
        c0Var.setFilters(A(c0Var.getFilters()));
    }

    public final void i0() {
        c0 c0Var = this.f3863a;
        TransformationMethod transformationMethod = c0Var.getTransformationMethod();
        if (this.f3865c) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new j(transformationMethod);
            }
        } else if (transformationMethod instanceof j) {
            transformationMethod = ((j) transformationMethod).f3871d;
        }
        c0Var.setTransformationMethod(transformationMethod);
    }
}
