package com.baidu.ar;

import android.text.TextUtils;
import com.baidu.ar.face.FaceListener;
import com.baidu.ar.face.IFace;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class z3 extends d0 implements IFace {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<IFace> f3799a;

    /* renamed from: b, reason: collision with root package name */
    public FaceListener f3800b;

    /* renamed from: c, reason: collision with root package name */
    public String f3801c;

    @Override // com.baidu.ar.d0
    public void a() {
        WeakReference<IFace> weakReference = this.f3799a;
        if (weakReference != null) {
            weakReference.clear();
            this.f3799a = null;
        }
        this.f3800b = null;
    }

    @Override // com.baidu.ar.face.IFace
    public void setFaceListener(FaceListener faceListener) {
        this.f3800b = faceListener;
        WeakReference<IFace> weakReference = this.f3799a;
        if (weakReference != null) {
            weakReference.get().setFaceListener(this.f3800b);
        }
    }

    @Override // com.baidu.ar.face.IFace
    public void setFaceModelPath(String str) {
        this.f3801c = str;
        WeakReference<IFace> weakReference = this.f3799a;
        if (weakReference != null) {
            weakReference.get().setFaceModelPath(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.baidu.ar.d0
    public void a(c0 c0Var) {
        if (c0Var == 0) {
            WeakReference<IFace> weakReference = this.f3799a;
            if (weakReference != null) {
                weakReference.clear();
                this.f3799a = null;
                return;
            }
            return;
        }
        if (c0Var instanceof IFace) {
            this.f3799a = new WeakReference<>((IFace) c0Var);
            if (!TextUtils.isEmpty(this.f3801c)) {
                this.f3799a.get().setFaceModelPath(this.f3801c);
            }
        }
        if (this.f3800b != null) {
            this.f3799a.get().setFaceListener(this.f3800b);
        }
    }
}
