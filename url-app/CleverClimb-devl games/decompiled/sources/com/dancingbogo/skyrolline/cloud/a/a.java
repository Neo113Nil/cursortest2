package com.dancingbogo.skyrolline.cloud.a;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.dancingbogo.skyrolline.cloud.c;
import com.dancingbogo.skyrolline.ipc.IpcProvider;
import com.dancingbogo.skyrolline.util.b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CloudCfgGetterIPCInvoker.java */
/* loaded from: classes2.dex */
public class a implements c, com.dancingbogo.skyrolline.ipc.c {
    @Override // com.dancingbogo.skyrolline.ipc.c
    public int a() {
        return 4;
    }

    /* compiled from: CloudCfgGetterIPCInvoker.java */
    /* renamed from: com.dancingbogo.skyrolline.cloud.a.a$a, reason: collision with other inner class name */
    public static class C0334a extends com.dancingbogo.skyrolline.ipc.a {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.dancingbogo.skyrolline.ipc.b
        public String a(ContentValues contentValues) {
            switch (contentValues.getAsInteger("func_type").intValue()) {
                case 1:
                    return com.dancingbogo.skyrolline.cloud.a.a().b(contentValues.getAsInteger("arg1").intValue(), contentValues.getAsString("arg2"));
                case 2:
                    List<String> a2 = com.dancingbogo.skyrolline.cloud.a.a().a(contentValues.getAsInteger("arg1").intValue(), contentValues.getAsString("arg2"));
                    if (a2 == null || a2.size() <= 0) {
                        return null;
                    }
                    StringBuilder sb = new StringBuilder(a2.get(0));
                    for (int i = 1; i < a2.size(); i++) {
                        sb.append("**");
                        sb.append(a2.get(i));
                    }
                    return sb.toString();
                case 3:
                    return com.dancingbogo.skyrolline.cloud.a.a().a(contentValues.getAsInteger("arg1").intValue(), contentValues.getAsString("arg2"), contentValues.getAsString("arg3"), contentValues.getAsString("arg4"));
                case 4:
                    return String.valueOf(com.dancingbogo.skyrolline.cloud.a.a().a(contentValues.getAsInteger("arg1").intValue(), contentValues.getAsString("arg2"), contentValues.getAsString("arg3"), contentValues.getAsInteger("arg4").intValue()));
                case 5:
                    return String.valueOf(com.dancingbogo.skyrolline.cloud.a.a().a(contentValues.getAsInteger("arg1").intValue(), contentValues.getAsString("arg2"), contentValues.getAsString("arg3"), contentValues.getAsLong("arg4").longValue()));
                case 6:
                    return String.valueOf(com.dancingbogo.skyrolline.cloud.a.a().a(contentValues.getAsInteger("arg1").intValue(), contentValues.getAsString("arg2"), contentValues.getAsString("arg3"), contentValues.getAsBoolean("arg4").booleanValue()));
                case 7:
                    return String.valueOf(com.dancingbogo.skyrolline.cloud.a.a().a(contentValues.getAsInteger("arg1").intValue(), contentValues.getAsString("arg2"), contentValues.getAsString("arg3"), contentValues.getAsDouble("arg4").doubleValue()));
                case 8:
                    b.b("CloudCfgGetterIPCInvoker", "TYPE_REFRESH_DATA = " + com.dancingbogo.skyrolline.c.a.a());
                    com.dancingbogo.skyrolline.cloud.b.a(a()).a();
                    return null;
                case 9:
                    com.dancingbogo.skyrolline.cloud.b.a(a()).b();
                    return null;
                default:
                    return null;
            }
        }
    }

    @Override // com.dancingbogo.skyrolline.cloud.c
    public List<String> a(int i, String str) {
        String[] split;
        ContentValues contentValues = new ContentValues();
        contentValues.put("func_type", (Integer) 2);
        contentValues.put("arg1", Integer.valueOf(i));
        contentValues.put("arg2", str);
        String a2 = IpcProvider.a(contentValues, this);
        if (a2 == null || (split = a2.split("\\*\\*")) == null || split.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            arrayList.add(str2);
        }
        return arrayList;
    }

    @Override // com.dancingbogo.skyrolline.cloud.c
    public String b(int i, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("func_type", (Integer) 1);
        contentValues.put("arg1", Integer.valueOf(i));
        contentValues.put("arg2", str);
        return IpcProvider.a(contentValues, this);
    }

    @Override // com.dancingbogo.skyrolline.cloud.c
    public String a(int i, String str, String str2, String str3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("func_type", (Integer) 3);
        contentValues.put("arg1", Integer.valueOf(i));
        contentValues.put("arg2", str);
        contentValues.put("arg3", str2);
        contentValues.put("arg4", str3);
        String a2 = IpcProvider.a(contentValues, this);
        return TextUtils.isEmpty(a2) ? str3 : a2;
    }

    @Override // com.dancingbogo.skyrolline.cloud.c
    public int a(int i, String str, String str2, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("func_type", (Integer) 4);
        contentValues.put("arg1", Integer.valueOf(i));
        contentValues.put("arg2", str);
        contentValues.put("arg3", str2);
        contentValues.put("arg4", Integer.valueOf(i2));
        String a2 = IpcProvider.a(contentValues, this);
        return TextUtils.isEmpty(a2) ? i2 : Integer.valueOf(a2).intValue();
    }

    @Override // com.dancingbogo.skyrolline.cloud.c
    public long a(int i, String str, String str2, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("func_type", (Integer) 5);
        contentValues.put("arg1", Integer.valueOf(i));
        contentValues.put("arg2", str);
        contentValues.put("arg3", str2);
        contentValues.put("arg4", Long.valueOf(j));
        String a2 = IpcProvider.a(contentValues, this);
        return TextUtils.isEmpty(a2) ? j : Long.valueOf(a2).longValue();
    }

    @Override // com.dancingbogo.skyrolline.cloud.c
    public boolean a(int i, String str, String str2, boolean z) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("func_type", (Integer) 6);
        contentValues.put("arg1", Integer.valueOf(i));
        contentValues.put("arg2", str);
        contentValues.put("arg3", str2);
        contentValues.put("arg4", Boolean.valueOf(z));
        String a2 = IpcProvider.a(contentValues, this);
        return TextUtils.isEmpty(a2) ? z : Boolean.valueOf(a2).booleanValue();
    }

    @Override // com.dancingbogo.skyrolline.cloud.c
    public double a(int i, String str, String str2, double d2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("func_type", (Integer) 7);
        contentValues.put("arg1", Integer.valueOf(i));
        contentValues.put("arg2", str);
        contentValues.put("arg3", str2);
        contentValues.put("arg4", Double.valueOf(d2));
        String a2 = IpcProvider.a(contentValues, this);
        return TextUtils.isEmpty(a2) ? d2 : Double.valueOf(a2).doubleValue();
    }

    @Override // com.dancingbogo.skyrolline.cloud.c
    public void a(Context context) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("func_type", (Integer) 8);
        IpcProvider.a(contentValues, this);
    }

    @Override // com.dancingbogo.skyrolline.cloud.c
    public void b(Context context) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("func_type", (Integer) 9);
        IpcProvider.a(contentValues, this);
    }
}
