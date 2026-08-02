package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atj implements alj {
    private final /* synthetic */ int a;

    public atj(int i) {
        this.a = i;
    }

    @Override // defpackage.alj
    public final void a(amj amjVar) {
        if (this.a == 0) {
            amjVar.e("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
            return;
        }
        amjVar.e("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        int i = 0;
        Object[] objArr = new Object[0];
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = contentValues.size();
        Object[] objArr2 = new Object[size];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(ams.a[3]);
        sb.append("WorkSpec SET ");
        for (String str : contentValues.keySet()) {
            sb.append(i > 0 ? "," : "");
            sb.append(str);
            objArr2[i] = contentValues.get(str);
            sb.append("=?");
            i++;
        }
        for (int i2 = size; i2 < size; i2++) {
            objArr2[i2] = objArr[i2 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        amz i3 = ((ams) amjVar).i(sb.toString());
        yj.n(i3, objArr2);
        i3.a.executeUpdateDelete();
    }
}
