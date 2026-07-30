package com.baidu.ar;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.ar.lua.LuaMsgListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class i8 implements s3 {

    /* renamed from: a, reason: collision with root package name */
    public Context f2449a;

    /* renamed from: b, reason: collision with root package name */
    public List<LuaMsgListener> f2450b = Collections.synchronizedList(new ArrayList());

    @Override // com.baidu.ar.s3
    public List<Integer> a() {
        return Arrays.asList(1901);
    }

    public synchronized void b() {
        List<LuaMsgListener> list = this.f2450b;
        if (list != null) {
            list.clear();
            this.f2450b = null;
        }
    }

    @Override // com.baidu.ar.s3
    public synchronized void a(int i8, int i9, HashMap<String, Object> hashMap) {
        List<String> msgKeyListened;
        try {
            if (hashMap != null) {
                try {
                    if (hashMap.entrySet().size() > 0 && hashMap.containsKey("id")) {
                        if (Integer.parseInt(hashMap.get("id").toString()) == 9001) {
                            new fb(this.f2449a).a(hashMap);
                        }
                    }
                } catch (NumberFormatException e8) {
                    e8.printStackTrace();
                }
            }
            if (this.f2450b != null && hashMap != null) {
                for (int i10 = 0; i10 < this.f2450b.size(); i10++) {
                    LuaMsgListener luaMsgListener = this.f2450b.get(i10);
                    if (luaMsgListener != null && (msgKeyListened = luaMsgListener.getMsgKeyListened()) != null) {
                        for (int i11 = 0; i11 < msgKeyListened.size(); i11++) {
                            String str = msgKeyListened.get(i11);
                            if (!TextUtils.isEmpty(str) && hashMap.get(str) != null) {
                                luaMsgListener.onLuaMessage(hashMap);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean b(LuaMsgListener luaMsgListener) {
        List<LuaMsgListener> list = this.f2450b;
        if (list == null) {
            return false;
        }
        for (LuaMsgListener luaMsgListener2 : list) {
            if (luaMsgListener2 != null && luaMsgListener2.equals(luaMsgListener)) {
                h.a("LuaMsgBridge", "removeLuaMsgListener luaMsgListener = " + luaMsgListener.hashCode());
                return this.f2450b.remove(luaMsgListener2);
            }
        }
        return false;
    }

    public void a(Context context) {
        this.f2449a = context;
    }

    public synchronized boolean a(LuaMsgListener luaMsgListener) {
        List<LuaMsgListener> list = this.f2450b;
        if (list == null) {
            return false;
        }
        for (LuaMsgListener luaMsgListener2 : list) {
            if (luaMsgListener2 != null && luaMsgListener2.equals(luaMsgListener)) {
                return false;
            }
        }
        h.a("LuaMsgBridge", "addLuaMsgListener luaMsgListener = " + luaMsgListener.hashCode());
        return this.f2450b.add(luaMsgListener);
    }
}
