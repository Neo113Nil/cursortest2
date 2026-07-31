package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public class phc {
    private static int zmn;
    private static final LinkedHashMap<String, SoftReference<zmn>> fs = new LinkedHashMap<String, SoftReference<zmn>>(zmn, 0.75f, true) { // from class: com.bytedance.sdk.openadsdk.utils.phc.1
        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<String, SoftReference<zmn>> entry) {
            zmn zmnVar;
            com.bytedance.sdk.component.bvs.nps npsVar;
            if (size() <= phc.zmn) {
                return false;
            }
            SoftReference<zmn> value = entry.getValue();
            if (value == null || (zmnVar = value.get()) == null || (npsVar = zmnVar.zmn) == null) {
                return true;
            }
            try {
                com.bytedance.sdk.component.utils.zak.zmn(npsVar);
                return true;
            } catch (Throwable unused) {
                entry.getKey();
                return true;
            }
        }
    };

    private static class zmn {
        Bundle fs;
        com.bytedance.sdk.component.bvs.nps zmn;

        zmn(com.bytedance.sdk.component.bvs.nps npsVar, Bundle bundle) {
            this.zmn = npsVar;
            this.fs = bundle;
        }
    }

    public static void zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        if (nqiVar == null) {
            zmn = 0;
        } else {
            zmn = Math.max(0, nqiVar.nps());
        }
        fs();
    }

    private static void fs() {
        zmn zmnVar;
        com.bytedance.sdk.component.bvs.nps npsVar;
        synchronized (fs) {
            while (true) {
                LinkedHashMap<String, SoftReference<zmn>> linkedHashMap = fs;
                if (linkedHashMap.size() > zmn) {
                    SoftReference<zmn> remove = linkedHashMap.remove(linkedHashMap.keySet().iterator().next());
                    if (remove != null && (zmnVar = remove.get()) != null && (npsVar = zmnVar.zmn) != null) {
                        try {
                            com.bytedance.sdk.component.utils.zak.zmn(npsVar);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    public static void zmn(String str, com.bytedance.sdk.component.bvs.nps npsVar, Bundle bundle) {
        if (zmn <= 0 || TextUtils.isEmpty(str) || npsVar == null) {
            return;
        }
        LinkedHashMap<String, SoftReference<zmn>> linkedHashMap = fs;
        synchronized (linkedHashMap) {
            try {
                zmn(npsVar.getWebView());
                zmn(npsVar, npsVar.getContext());
                synchronized (linkedHashMap) {
                    linkedHashMap.put(str, new SoftReference<>(new zmn(npsVar, bundle)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        linkedHashMap.size();
    }

    public static com.bytedance.sdk.component.bvs.nps zmn(Context context, String str) {
        com.bytedance.sdk.component.bvs.nps npsVar;
        if (zmn <= 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        LinkedHashMap<String, SoftReference<zmn>> linkedHashMap = fs;
        synchronized (linkedHashMap) {
            try {
                SoftReference<zmn> remove = linkedHashMap.remove(str);
                if (remove == null) {
                    return null;
                }
                zmn zmnVar = remove.get();
                if (zmnVar != null && (npsVar = zmnVar.zmn) != null) {
                    zmn(npsVar, context);
                    return zmnVar.zmn;
                }
                return null;
            } finally {
            }
        }
    }

    public static Bundle zmn(String str) {
        if (zmn <= 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        LinkedHashMap<String, SoftReference<zmn>> linkedHashMap = fs;
        synchronized (linkedHashMap) {
            try {
                SoftReference<zmn> softReference = linkedHashMap.get(str);
                if (softReference == null) {
                    return null;
                }
                zmn zmnVar = softReference.get();
                return zmnVar != null ? zmnVar.fs : null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void zmn(com.bytedance.sdk.component.bvs.nps npsVar, Context context) {
        if (npsVar == null || context == null) {
            return;
        }
        try {
            if (npsVar.getContext() instanceof MutableContextWrapper) {
                ((MutableContextWrapper) npsVar.getContext()).setBaseContext(context.getApplicationContext());
            }
        } catch (ClassCastException unused) {
        }
        ViewGroup viewGroup = (ViewGroup) npsVar.getParent();
        if (viewGroup != null) {
            try {
                viewGroup.removeView(npsVar);
            } catch (Throwable unused2) {
            }
        }
    }

    private static void zmn(WebView webView) {
        if (webView != null && zmn > 0) {
            try {
                webView.evaluateJavascript("[].forEach.call(document.querySelectorAll('audio,video'), function(audio) { try { audio.pause(); } catch(e) {} })", null);
            } catch (Throwable unused) {
            }
        }
    }
}
