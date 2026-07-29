package com.facebook.ads.internal.m;

import android.content.Context;
import android.database.Cursor;
import com.facebook.ads.internal.m.b;
import com.facebook.ads.internal.q.a.r;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5209a = "g";

    /* renamed from: b, reason: collision with root package name */
    private Context f5210b;

    /* renamed from: c, reason: collision with root package name */
    private com.facebook.ads.internal.e.d f5211c;

    public g(Context context, com.facebook.ads.internal.e.d dVar) {
        this.f5210b = context;
        this.f5211c = dVar;
    }

    private static JSONArray a(JSONArray jSONArray, JSONArray jSONArray2) {
        int length = jSONArray != null ? 0 + jSONArray.length() : 0;
        if (jSONArray2 != null) {
            length += jSONArray2.length();
        }
        return a(jSONArray, jSONArray2, length);
    }

    private static JSONArray a(JSONArray jSONArray, JSONArray jSONArray2, int i) {
        if (jSONArray == null) {
            return jSONArray2;
        }
        if (jSONArray2 == null) {
            return jSONArray;
        }
        int length = jSONArray.length();
        int length2 = jSONArray2.length();
        JSONArray jSONArray3 = new JSONArray();
        int i2 = 0;
        int i3 = i;
        double d2 = Double.MAX_VALUE;
        double d3 = Double.MAX_VALUE;
        JSONObject jSONObject = null;
        JSONObject jSONObject2 = null;
        int i4 = 0;
        while (true) {
            if ((i2 < length || i4 < length2) && i3 > 0) {
                if (i2 < length && jSONObject == null) {
                    try {
                        jSONObject = jSONArray.getJSONObject(i2);
                        d2 = jSONObject.getDouble("time");
                    } catch (JSONException unused) {
                        d2 = Double.MAX_VALUE;
                        jSONObject = null;
                    }
                    i2++;
                }
                if (i4 < length2 && jSONObject2 == null) {
                    try {
                        jSONObject2 = jSONArray2.getJSONObject(i4);
                        d3 = jSONObject2.getDouble("time");
                    } catch (JSONException unused2) {
                        d3 = Double.MAX_VALUE;
                        jSONObject2 = null;
                    }
                    i4++;
                }
                if (jSONObject != null || jSONObject2 != null) {
                    if (jSONObject == null || d3 < d2) {
                        jSONArray3.put(jSONObject2);
                        d3 = Double.MAX_VALUE;
                        jSONObject2 = null;
                    } else {
                        jSONArray3.put(jSONObject);
                        d2 = Double.MAX_VALUE;
                        jSONObject = null;
                    }
                    i3--;
                }
            }
        }
        if (i3 > 0) {
            if (jSONObject != null) {
                jSONArray3.put(jSONObject);
            } else if (jSONObject2 != null) {
                jSONArray3.put(jSONObject2);
            }
        }
        return jSONArray3;
    }

    private JSONObject a(int i) {
        Cursor cursor;
        Cursor cursor2;
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        JSONArray a2;
        try {
            cursor = this.f5211c.d();
            try {
                cursor2 = this.f5211c.a(i);
                try {
                    if (cursor2.getCount() > 0) {
                        jSONObject = a(cursor2);
                        jSONArray = c(cursor2);
                    } else {
                        jSONObject = null;
                        jSONArray = null;
                    }
                    if (com.facebook.ads.internal.l.a.g(this.f5210b) && (a2 = com.facebook.ads.internal.f.e.a(this.f5210b, i)) != null && a2.length() > 0) {
                        jSONArray = a(a2, jSONArray, i);
                    }
                    if (jSONArray != null) {
                        jSONObject2 = new JSONObject();
                        if (jSONObject != null) {
                            jSONObject2.put("tokens", jSONObject);
                        }
                        jSONObject2.put("events", jSONArray);
                    } else {
                        jSONObject2 = null;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return jSONObject2;
                } catch (JSONException unused) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (JSONException unused2) {
                cursor2 = null;
            } catch (Throwable th2) {
                th = th2;
                cursor2 = null;
            }
        } catch (JSONException unused3) {
            cursor = null;
            cursor2 = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            cursor2 = null;
        }
    }

    private JSONObject a(Cursor cursor) {
        JSONObject jSONObject = new JSONObject();
        while (cursor.moveToNext()) {
            jSONObject.put(cursor.getString(0), cursor.getString(1));
        }
        return jSONObject;
    }

    private void a(String str) {
        if (com.facebook.ads.internal.f.e.c(str)) {
            com.facebook.ads.internal.f.e.a(str);
        } else {
            this.f5211c.a(str);
        }
    }

    private JSONArray b(Cursor cursor) {
        JSONArray jSONArray = new JSONArray();
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", cursor.getString(com.facebook.ads.internal.e.c.f5083a.f5080a));
            jSONObject.put("token_id", cursor.getString(com.facebook.ads.internal.e.c.f5084b.f5080a));
            jSONObject.put("type", cursor.getString(com.facebook.ads.internal.e.c.f5086d.f5080a));
            jSONObject.put("time", r.a(cursor.getDouble(com.facebook.ads.internal.e.c.e.f5080a)));
            jSONObject.put("session_time", r.a(cursor.getDouble(com.facebook.ads.internal.e.c.f.f5080a)));
            jSONObject.put(TapjoyConstants.TJC_SESSION_ID, cursor.getString(com.facebook.ads.internal.e.c.g.f5080a));
            String string = cursor.getString(com.facebook.ads.internal.e.c.h.f5080a);
            jSONObject.put("data", string != null ? new JSONObject(string) : new JSONObject());
            jSONObject.put("attempt", cursor.getString(com.facebook.ads.internal.e.c.i.f5080a));
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    private JSONArray c(Cursor cursor) {
        JSONArray jSONArray = new JSONArray();
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", cursor.getString(2));
            jSONObject.put("token_id", cursor.getString(0));
            jSONObject.put("type", cursor.getString(4));
            jSONObject.put("time", r.a(cursor.getDouble(5)));
            jSONObject.put("session_time", r.a(cursor.getDouble(6)));
            jSONObject.put(TapjoyConstants.TJC_SESSION_ID, cursor.getString(7));
            String string = cursor.getString(8);
            jSONObject.put("data", string != null ? new JSONObject(string) : new JSONObject());
            jSONObject.put("attempt", cursor.getString(9));
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    private JSONObject d() {
        Cursor cursor;
        Throwable th;
        Cursor cursor2;
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONArray a2;
        JSONObject jSONObject2 = null;
        try {
            cursor2 = this.f5211c.f();
            try {
                cursor = this.f5211c.e();
            } catch (JSONException unused) {
                cursor = null;
            } catch (Throwable th2) {
                cursor = null;
                th = th2;
            }
        } catch (JSONException unused2) {
            cursor2 = null;
            cursor = null;
        } catch (Throwable th3) {
            cursor = null;
            th = th3;
            cursor2 = null;
        }
        try {
            if (cursor2.getCount() <= 0 || cursor.getCount() <= 0) {
                jSONObject = null;
                jSONArray = null;
            } else {
                jSONObject = a(cursor2);
                jSONArray = b(cursor);
            }
            if (com.facebook.ads.internal.l.a.g(this.f5210b) && (a2 = com.facebook.ads.internal.f.e.a(this.f5210b)) != null && a2.length() > 0) {
                jSONArray = a(a2, jSONArray);
            }
            if (jSONArray != null) {
                JSONObject jSONObject3 = new JSONObject();
                if (jSONObject != null) {
                    jSONObject3.put("tokens", jSONObject);
                }
                jSONObject3.put("events", jSONArray);
                jSONObject2 = jSONObject3;
            }
            if (cursor2 != null) {
                cursor2.close();
            }
            if (cursor != null) {
                cursor.close();
            }
            return jSONObject2;
        } catch (JSONException unused3) {
            if (cursor2 != null) {
                cursor2.close();
            }
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            if (cursor2 != null) {
                cursor2.close();
            }
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.internal.m.b.a
    public JSONObject a() {
        int j = com.facebook.ads.internal.l.a.j(this.f5210b);
        return j > 0 ? a(j) : d();
    }

    @Override // com.facebook.ads.internal.m.b.a
    public boolean a(JSONArray jSONArray) {
        String string;
        int i;
        boolean g = com.facebook.ads.internal.l.a.g(this.f5210b);
        boolean z = true;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                string = jSONObject.getString("id");
                i = jSONObject.getInt("code");
            } catch (JSONException unused) {
            }
            if (i == 1) {
                if (!this.f5211c.b(string)) {
                    if (!g) {
                    }
                }
            } else {
                if (i >= 1000 && i < 2000) {
                    a(string);
                    z = false;
                } else if (i >= 2000) {
                    if (i < 3000) {
                        if (!this.f5211c.b(string)) {
                            if (!g) {
                            }
                        }
                    }
                }
            }
            com.facebook.ads.internal.f.e.b(string);
        }
        return z;
    }

    @Override // com.facebook.ads.internal.m.b.a
    public void b() {
        this.f5211c.g();
        this.f5211c.b();
        com.facebook.ads.internal.f.e.c(this.f5210b);
    }

    @Override // com.facebook.ads.internal.m.b.a
    public void b(JSONArray jSONArray) {
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                a(jSONArray.getJSONObject(i).getString("id"));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // com.facebook.ads.internal.m.b.a
    public boolean c() {
        Cursor cursor;
        int j = com.facebook.ads.internal.l.a.j(this.f5210b);
        if (j < 1) {
            return false;
        }
        try {
            cursor = this.f5211c.d();
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        try {
            boolean z = (cursor.moveToFirst() ? cursor.getInt(0) : 0) + com.facebook.ads.internal.f.e.b(this.f5210b) > j;
            if (cursor != null) {
                cursor.close();
            }
            return z;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
