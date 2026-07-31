package androidx.databinding;

import androidx.databinding.h;

/* loaded from: classes.dex */
public abstract class a implements h {
    private transient n mCallbacks;

    @Override // androidx.databinding.h
    public void addOnPropertyChangedCallback(h.a aVar) {
        synchronized (this) {
            try {
                if (this.mCallbacks == null) {
                    this.mCallbacks = new n();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.mCallbacks.a(aVar);
    }

    public void notifyChange() {
        synchronized (this) {
            try {
                n nVar = this.mCallbacks;
                if (nVar == null) {
                    return;
                }
                nVar.g(this, 0, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void notifyPropertyChanged(int i4) {
        synchronized (this) {
            try {
                n nVar = this.mCallbacks;
                if (nVar == null) {
                    return;
                }
                nVar.g(this, i4, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.h
    public void removeOnPropertyChangedCallback(h.a aVar) {
        synchronized (this) {
            try {
                n nVar = this.mCallbacks;
                if (nVar == null) {
                    return;
                }
                nVar.l(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
