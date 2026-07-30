package com.yanzhenjie.kalle;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class m {
    private final Map<String, List<Object>> mMap;

    public static class b {
        private Map<String, List<Object>> mMap;

        public b add(String str, int i8) {
            return add(str, (CharSequence) Integer.toString(i8));
        }

        public b binaries(String str, List<com.yanzhenjie.kalle.b> list) {
            Iterator<com.yanzhenjie.kalle.b> it = list.iterator();
            while (it.hasNext()) {
                binary(str, it.next());
            }
            return this;
        }

        public b binary(String str, com.yanzhenjie.kalle.b bVar) {
            return add(str, bVar);
        }

        public m build() {
            return new m(this);
        }

        public b clear() {
            this.mMap.clear();
            return this;
        }

        public b file(String str, File file) {
            return add(str, file);
        }

        public b files(String str, List<File> list) {
            Iterator<File> it = list.iterator();
            while (it.hasNext()) {
                add(str, it.next());
            }
            return this;
        }

        public b remove(String str) {
            this.mMap.remove(str);
            return this;
        }

        public b set(m mVar) {
            return clear().add(mVar);
        }

        public b add(String str, long j8) {
            return add(str, (CharSequence) Long.toString(j8));
        }

        private b() {
            this.mMap = new LinkedHashMap();
        }

        public b add(String str, boolean z7) {
            return add(str, (CharSequence) Boolean.toString(z7));
        }

        public b add(String str, char c8) {
            return add(str, (CharSequence) String.valueOf(c8));
        }

        private b(Map<String, List<Object>> map) {
            this.mMap = map;
        }

        public b add(String str, double d8) {
            return add(str, (CharSequence) Double.toString(d8));
        }

        public b add(String str, float f8) {
            return add(str, (CharSequence) Float.toString(f8));
        }

        public b add(String str, short s7) {
            return add(str, (CharSequence) Integer.toString(s7));
        }

        public b add(String str, CharSequence charSequence) {
            return add(str, (Object) charSequence);
        }

        public b add(String str, List<String> list) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                add(str, (CharSequence) it.next());
            }
            return this;
        }

        private b add(String str, Object obj) {
            if (!TextUtils.isEmpty(str)) {
                if (!this.mMap.containsKey(str)) {
                    this.mMap.put(str, new ArrayList(1));
                }
                if (obj == null) {
                    obj = "";
                }
                if (obj instanceof File) {
                    obj = new g((File) obj);
                }
                this.mMap.get(str).add(obj);
            }
            return this;
        }

        public b add(m mVar) {
            for (Map.Entry<String, List<Object>> entry : mVar.entrySet()) {
                String key = entry.getKey();
                Iterator<Object> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    add(key, it.next());
                }
            }
            return this;
        }
    }

    public static b newBuilder() {
        return new b();
    }

    public b builder() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, List<Object>> entry : this.mMap.entrySet()) {
            linkedHashMap.put(entry.getKey(), new ArrayList(entry.getValue()));
        }
        return new b(linkedHashMap);
    }

    public boolean containsKey(String str) {
        return this.mMap.containsKey(str);
    }

    public Set<Map.Entry<String, List<Object>>> entrySet() {
        return this.mMap.entrySet();
    }

    public List<Object> get(String str) {
        return this.mMap.get(str);
    }

    public Object getFirst(String str) {
        List<Object> list = this.mMap.get(str);
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    public boolean hasBinary() {
        Iterator<Map.Entry<String, List<Object>>> it = entrySet().iterator();
        while (it.hasNext()) {
            List<Object> value = it.next().getValue();
            if (value.size() > 0) {
                Iterator<Object> it2 = value.iterator();
                while (it2.hasNext()) {
                    if (it2.next() instanceof com.yanzhenjie.kalle.b) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return this.mMap.isEmpty();
    }

    public Set<String> keySet() {
        return this.mMap.keySet();
    }

    public h toFormBody() {
        return h.newBuilder().params(this).build();
    }

    public String toString() {
        return toString(false);
    }

    public u toUrlBody() {
        return u.newBuilder().params(this).build();
    }

    private m(b bVar) {
        this.mMap = bVar.mMap;
    }

    public String toString(boolean z7) {
        StringBuilder sb = new StringBuilder();
        for (String str : keySet()) {
            for (Object obj : get(str)) {
                if (obj instanceof CharSequence) {
                    String obj2 = obj.toString();
                    if (z7) {
                        obj2 = Uri.encode(obj2);
                    }
                    sb.append("&");
                    sb.append(str);
                    sb.append("=");
                    sb.append(obj2);
                }
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
