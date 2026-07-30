package com.baidu.ar;

import android.content.Context;
import com.baidu.ar.arplay.core.message.ARPMessage;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class r3 extends m0 {

    /* renamed from: c, reason: collision with root package name */
    public List<WeakReference<s3>> f3033c;

    /* renamed from: d, reason: collision with root package name */
    public i8 f3034d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3035e;

    public r3(Context context) {
        super(context);
        this.f3033c = Collections.synchronizedList(new ArrayList());
        this.f3035e = false;
        a();
        i8 i8Var = new i8();
        this.f3034d = i8Var;
        i8Var.a(context);
        a(this.f3034d);
    }

    public void a(int i8, HashMap<String, Object> hashMap) {
        ARPMessage.getInstance().sendMessage(i8, hashMap);
    }

    public void b(String str) {
        ARPMessage.getInstance().sendLuaScriptToEngine(str);
    }

    public synchronized void c() {
        try {
            i8 i8Var = this.f3034d;
            if (i8Var != null) {
                i8Var.b();
                this.f3034d = null;
            }
            List<WeakReference<s3>> list = this.f3033c;
            if (list != null) {
                Iterator<WeakReference<s3>> it = list.iterator();
                while (it.hasNext()) {
                    it.next().clear();
                }
                this.f3033c.clear();
                this.f3033c = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public i8 d() {
        return this.f3034d;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    @Override // com.baidu.ar.m0, com.baidu.ar.arplay.core.message.ARPMessage.MessageHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void handleMessage(int i8, int i9, HashMap<String, Object> hashMap) {
        s3 s3Var;
        try {
            h.a("EngineMsgBridge", "handleMessage aMessageType = " + i8 + " && aMessageID = " + i9);
            if (this.f3035e && a(i8, i9, hashMap)) {
                i8 = 1901;
                if (this.f3033c != null) {
                    return;
                }
                for (int i10 = 0; i10 < this.f3033c.size(); i10++) {
                    WeakReference<s3> weakReference = this.f3033c.get(i10);
                    if (weakReference != null && (s3Var = weakReference.get()) != null && s3Var.a() != null) {
                        Iterator<Integer> it = s3Var.a().iterator();
                        while (it.hasNext()) {
                            if (i8 == it.next().intValue()) {
                                s3Var.a(i8, i9, hashMap);
                            }
                        }
                    }
                }
                return;
            }
            if (i8 != 8200) {
                super.handleMessage(i8, i9, hashMap);
            }
            if (this.f3033c != null) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void a(boolean z7) {
        this.f3035e = z7;
    }

    public synchronized boolean b(s3 s3Var) {
        List<WeakReference<s3>> list = this.f3033c;
        if (list == null) {
            return false;
        }
        for (WeakReference<s3> weakReference : list) {
            if (weakReference.get() != null && weakReference.get().equals(s3Var)) {
                h.a("EngineMsgBridge", "removeEngineMsgListener engineMsgListener = " + s3Var.hashCode());
                boolean remove = this.f3033c.remove(weakReference);
                weakReference.clear();
                return remove;
            }
        }
        return false;
    }

    public final synchronized boolean a(int i8, int i9, HashMap<String, Object> hashMap) {
        if (i8 == 1001) {
            hashMap.put("audio_status", "audio_play");
            return true;
        }
        if (i8 == 1003) {
            hashMap.put("audio_status", "audio_pause");
            return true;
        }
        if (i8 == 1005) {
            hashMap.put("audio_status", "audio_resume");
            return true;
        }
        if (i8 == 1007) {
            hashMap.put("audio_status", "audio_stop");
            return true;
        }
        if (i8 != 1012) {
            return false;
        }
        hashMap.put("audio_status", "audio_reset");
        return true;
    }

    public synchronized boolean a(s3 s3Var) {
        List<WeakReference<s3>> list = this.f3033c;
        if (list == null) {
            return false;
        }
        for (WeakReference<s3> weakReference : list) {
            if (weakReference.get() != null && weakReference.get().equals(s3Var)) {
                return false;
            }
        }
        h.a("EngineMsgBridge", "addEngineMsgListener engineMsgListener = " + s3Var.hashCode());
        return this.f3033c.add(new WeakReference<>(s3Var));
    }
}
