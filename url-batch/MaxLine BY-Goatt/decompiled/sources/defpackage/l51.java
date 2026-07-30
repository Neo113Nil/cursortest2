package defpackage;

import android.content.Context;
import com.google.firebase.datastorage.JavaDataStorage;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class l51 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ JavaDataStorage n;

    public /* synthetic */ l51(JavaDataStorage javaDataStorage, int i) {
        this.m = i;
        this.n = javaDataStorage;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d42 dataStore_delegate$lambda$0;
        List dataStore_delegate$lambda$1;
        int i = this.m;
        JavaDataStorage javaDataStorage = this.n;
        switch (i) {
            case 0:
                dataStore_delegate$lambda$0 = JavaDataStorage.dataStore_delegate$lambda$0(javaDataStorage, (f50) obj);
                return dataStore_delegate$lambda$0;
            default:
                dataStore_delegate$lambda$1 = JavaDataStorage.dataStore_delegate$lambda$1(javaDataStorage, (Context) obj);
                return dataStore_delegate$lambda$1;
        }
    }
}
