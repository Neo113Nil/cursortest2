package S1;

import W.InterfaceC0118k;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import c0.E;
import c0.I;
import c0.K;
import c0.RunnableC0282o;
import c0.q;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.image.FlutterImageDecoder;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements h, InterfaceC0118k, FlutterImageDecoder.HeaderListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f2582a;

    public /* synthetic */ g(long j4) {
        this.f2582a = j4;
    }

    @Override // S1.h
    public Object apply(Object obj) {
        long j4 = this.f2582a;
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
        try {
            Cursor cursor = rawQuery;
            cursor.moveToNext();
            return new O1.g(cursor.getLong(0), j4);
        } finally {
            rawQuery.close();
        }
    }

    @Override // W.InterfaceC0118k
    public void invoke(Object obj) {
        t1.h hVar;
        E e4 = (E) obj;
        I i4 = e4.f5436b;
        if (e4.equals(i4.f5487j) && (hVar = i4.n) != null) {
            K k4 = (K) hVar.f15398b;
            k4.f5512a1 = true;
            q qVar = k4.f5502P0;
            Handler handler = qVar.f5600a;
            if (handler != null) {
                handler.post(new RunnableC0282o(qVar, this.f2582a));
            }
        }
    }

    @Override // io.flutter.embedding.engine.image.FlutterImageDecoder.HeaderListener
    public void onImageHeader(int i4, int i5) {
        FlutterJNI.nativeImageHeaderCallback(this.f2582a, i4, i5);
    }
}
