package com.baidu.ar;

import android.text.TextUtils;
import android.util.Log;
import com.baidu.ar.lua.LuaMsgListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class j8 {

    /* renamed from: a, reason: collision with root package name */
    public r3 f2537a;

    /* renamed from: b, reason: collision with root package name */
    public LuaMsgListener f2538b;

    /* renamed from: c, reason: collision with root package name */
    public s3 f2539c;

    /* renamed from: d, reason: collision with root package name */
    public DefinedLuaListener f2540d;

    public class a implements LuaMsgListener {
        public a() {
        }

        @Override // com.baidu.ar.lua.LuaMsgListener
        public List<String> getMsgKeyListened() {
            return Arrays.asList("id", "event_name");
        }

        @Override // com.baidu.ar.lua.LuaMsgListener
        public void onLuaMessage(HashMap<String, Object> hashMap) {
            if (j8.this.f2540d == null || j8.this.a(hashMap)) {
                return;
            }
            j8.this.b(hashMap);
        }
    }

    public class b implements s3 {
        public b() {
        }

        @Override // com.baidu.ar.s3
        public List<Integer> a() {
            return Arrays.asList(1301);
        }

        @Override // com.baidu.ar.s3
        public void a(int i8, int i9, HashMap<String, Object> hashMap) {
            if (i8 != 1301 || j8.this.f2540d == null) {
                return;
            }
            int intValue = ((Integer) hashMap.get("type")).intValue();
            j8.this.f2540d.onOpenUrl((String) hashMap.get("url"), intValue, hashMap);
        }
    }

    public j8(r3 r3Var) {
        if (r3Var == null) {
            return;
        }
        this.f2537a = r3Var;
        a();
        if (this.f2538b == null) {
            this.f2538b = new a();
        }
        if (r3Var.d() != null) {
            r3Var.d().a(this.f2538b);
        }
    }

    public void b() {
        r3 r3Var = this.f2537a;
        if (r3Var != null) {
            if (this.f2538b != null) {
                r3Var.d().b(this.f2538b);
                this.f2538b = null;
            }
            s3 s3Var = this.f2539c;
            if (s3Var != null) {
                this.f2537a.b(s3Var);
                this.f2539c = null;
            }
            this.f2537a = null;
        }
        this.f2540d = null;
    }

    public final void a() {
        b bVar = new b();
        this.f2539c = bVar;
        this.f2537a.a(bVar);
    }

    public void a(DefinedLuaListener definedLuaListener) {
        this.f2540d = definedLuaListener;
    }

    public final boolean b(HashMap<String, Object> hashMap) {
        int a8 = a9.a(hashMap.get("id"), -1);
        Log.d("LuaMsgHelper", "switchCameraById id = " + a8);
        if (a8 != 10202) {
            return false;
        }
        this.f2540d.onRequireSwitchCamera(-1);
        return true;
    }

    public final boolean a(HashMap<String, Object> hashMap) {
        String str = (String) hashMap.get("event_name");
        if (TextUtils.isEmpty(str) || !"camera_switch".equals(str)) {
            return false;
        }
        String str2 = (String) hashMap.get("camera_action");
        Log.d("LuaMsgHelper", "swichCameraByEvent cameraFace = " + str2);
        if ("front".equals(str2)) {
            this.f2540d.onRequireSwitchCamera(1);
        } else if ("back".equals(str2)) {
            this.f2540d.onRequireSwitchCamera(0);
        } else {
            this.f2540d.onRequireSwitchCamera(-1);
        }
        return true;
    }
}
