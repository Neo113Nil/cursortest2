package t1;

import A0.f;
import android.os.AsyncTask;
import f0.C0322a;

/* renamed from: t1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractAsyncTaskC1190a extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public f f10370a;

    /* renamed from: b, reason: collision with root package name */
    public final C0322a f10371b;

    public AbstractAsyncTaskC1190a(C0322a c0322a) {
        this.f10371b = c0322a;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        f fVar = this.f10370a;
        if (fVar != null) {
            fVar.f25d = null;
            fVar.s();
        }
    }
}
