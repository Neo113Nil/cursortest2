package com.bytedance.sdk.component.adexpress.zmn.fs;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.adexpress.zmn.zn.zmn;
import com.bytedance.sdk.component.utils.yj;
import com.ironsource.B5;
import com.safedk.android.internal.partials.PangleFilesBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class zn {
    public abstract File zmn();

    protected boolean zmn(Map<String, com.bytedance.sdk.component.adexpress.zmn.zn.zmn> map) {
        if (map == null || map.size() == 0) {
            return false;
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            com.bytedance.sdk.component.adexpress.zmn.zn.zmn zmnVar = map.get(it.next());
            if (zmnVar != null && !zmn(zmnVar.hhw())) {
                return false;
            }
        }
        return true;
    }

    protected boolean zmn(List<zmn.C0126zmn> list) {
        if (list == null || list.size() <= 0 || zmn() == null) {
            return false;
        }
        for (zmn.C0126zmn c0126zmn : list) {
            String zmn = com.bytedance.sdk.component.utils.btk.zmn(c0126zmn.zmn());
            if (TextUtils.isEmpty(zmn)) {
                return false;
            }
            File file = new File(zmn(), zmn);
            String zmn2 = com.bytedance.sdk.component.utils.btk.zmn(file);
            if (!file.exists() || !file.isFile() || c0126zmn.fs() == null || !c0126zmn.fs().equals(zmn2)) {
                return false;
            }
        }
        return true;
    }

    protected boolean zmn(zmn.fs fsVar) {
        if (fsVar == null || zmn() == null) {
            return false;
        }
        List<Pair<String, String>> fs = fsVar.fs();
        if (fs == null || fs.size() <= 0) {
            return true;
        }
        Iterator<Pair<String, String>> it = fs.iterator();
        while (it.hasNext()) {
            File file = new File(zmn(), (String) it.next().first);
            if (!file.exists() || !file.isFile()) {
                return false;
            }
        }
        return true;
    }

    public List<zmn.C0126zmn> zmn(com.bytedance.sdk.component.adexpress.zmn.zn.zmn zmnVar, com.bytedance.sdk.component.adexpress.zmn.zn.zmn zmnVar2) {
        Map<String, com.bytedance.sdk.component.adexpress.zmn.zn.zmn> zmn = zmnVar.zmn();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (zmn.size() == 0) {
            if (zmnVar2 != null && zmnVar2.zmn().size() != 0) {
                Map<String, com.bytedance.sdk.component.adexpress.zmn.zn.zmn> zmn2 = zmnVar2.zmn();
                Iterator<String> it = zmn2.keySet().iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.zmn.zn.zmn zmnVar3 = zmn2.get(it.next());
                    if (zmnVar3 != null) {
                        arrayList.addAll(zmnVar3.hhw());
                    }
                }
            }
        } else if (zmnVar2 == null || zmnVar2.zmn().size() == 0) {
            if (zmn.size() != 0) {
                Iterator<String> it2 = zmn.keySet().iterator();
                while (it2.hasNext()) {
                    com.bytedance.sdk.component.adexpress.zmn.zn.zmn zmnVar4 = zmn.get(it2.next());
                    if (zmnVar4 != null) {
                        arrayList2.addAll(zmnVar4.hhw());
                    }
                }
            }
        } else {
            Map<String, com.bytedance.sdk.component.adexpress.zmn.zn.zmn> zmn3 = zmnVar2.zmn();
            for (String str : zmn.keySet()) {
                com.bytedance.sdk.component.adexpress.zmn.zn.zmn zmnVar5 = zmn.get(str);
                com.bytedance.sdk.component.adexpress.zmn.zn.zmn zmnVar6 = zmn3.get(str);
                if (zmnVar6 == null && zmnVar5 != null) {
                    arrayList2.addAll(zmnVar5.hhw());
                } else if (zmnVar5 == null && zmnVar6 != null) {
                    arrayList.addAll(zmnVar6.hhw());
                } else if (zmnVar5 != null) {
                    for (zmn.C0126zmn c0126zmn : zmnVar5.hhw()) {
                        if (c0126zmn != null && !zmnVar6.hhw().contains(c0126zmn) && c0126zmn.fs() != null && c0126zmn.zmn() != null) {
                            arrayList2.add(c0126zmn);
                        }
                    }
                    for (zmn.C0126zmn c0126zmn2 : zmnVar6.hhw()) {
                        if (c0126zmn2 != null && !zmnVar5.hhw().contains(c0126zmn2)) {
                            arrayList.add(c0126zmn2);
                        }
                    }
                }
            }
        }
        if (zmn(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    private boolean zmn(List<zmn.C0126zmn> list, List<zmn.C0126zmn> list2) {
        for (zmn.C0126zmn c0126zmn : list) {
            String zmn = c0126zmn.zmn();
            String zmn2 = com.bytedance.sdk.component.utils.btk.zmn(zmn);
            File file = new File(zmn(), zmn2);
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
            com.bytedance.sdk.component.nps.fs.zmn hhw = com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn().hhw();
            hhw.zn(zmn);
            hhw.zmn(zmn().getAbsolutePath(), zmn2);
            com.bytedance.sdk.component.nps.fs btk = hhw.btk();
            list2.add(c0126zmn);
            if (btk == null || !btk.hhw() || btk.btk() == null || !btk.btk().exists()) {
                zn(list2);
                return false;
            }
        }
        return true;
    }

    public List<zmn.C0126zmn> fs(com.bytedance.sdk.component.adexpress.zmn.zn.zmn zmnVar, com.bytedance.sdk.component.adexpress.zmn.zn.zmn zmnVar2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (zmnVar2 == null || zmnVar2.hhw().isEmpty()) {
            arrayList2.addAll(zmnVar.hhw());
        } else if (zmnVar.hhw().isEmpty()) {
            arrayList.addAll(zmnVar2.hhw());
        } else {
            for (zmn.C0126zmn c0126zmn : zmnVar.hhw()) {
                if (!zmnVar2.hhw().contains(c0126zmn) && c0126zmn != null && c0126zmn.zmn() != null && c0126zmn.fs() != null) {
                    arrayList2.add(c0126zmn);
                }
            }
            for (zmn.C0126zmn c0126zmn2 : zmnVar2.hhw()) {
                if (!zmnVar.hhw().contains(c0126zmn2)) {
                    arrayList.add(c0126zmn2);
                }
            }
        }
        if (zmn(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public void fs(List<zmn.C0126zmn> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<zmn.C0126zmn> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(zmn(), com.bytedance.sdk.component.utils.btk.zmn(it.next().zmn()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public boolean zmn(String str) {
        String zmn = com.bytedance.sdk.component.utils.btk.zmn(str);
        File file = new File(zmn().getAbsoluteFile(), zmn + ".zip");
        com.bytedance.sdk.component.nps.fs.zmn hhw = com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn().hhw();
        hhw.zn(str);
        hhw.zmn(file.getParent(), file.getName());
        com.bytedance.sdk.component.nps.fs btk = hhw.btk();
        if (btk.hhw() && btk.btk() != null && btk.btk().exists()) {
            File btk2 = btk.btk();
            try {
                yj.zmn(btk2.getAbsolutePath(), file.getParent());
                if (!btk2.exists()) {
                    return true;
                }
                btk2.delete();
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void zmn(int i) {
        if (com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().fb() != null) {
            com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().fb().zmn(i);
        }
    }

    public void zn(List<zmn.C0126zmn> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<zmn.C0126zmn> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(zmn(), com.bytedance.sdk.component.utils.btk.zmn(it.next().zmn()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public static void zmn(File file, com.bytedance.sdk.component.adexpress.zmn.zn.zmn zmnVar, String str) {
        FileOutputStream fileOutputStream;
        if (zmnVar == null) {
            return;
        }
        String iv = zmnVar.iv();
        if (TextUtils.isEmpty(iv)) {
            return;
        }
        File file2 = new File(file, str);
        File file3 = new File(file2 + ".tmp");
        if (file3.exists()) {
            file3.delete();
        }
        try {
            fileOutputStream = PangleFilesBridge.fileOutputStreamCtor(file3);
        } catch (Throwable unused) {
            fileOutputStream = null;
        }
        try {
            fileOutputStream.write(iv.getBytes(B5.O));
            if (file2.exists()) {
                file2.delete();
            }
            file3.renameTo(file2);
            try {
                fileOutputStream.close();
            } catch (IOException unused2) {
            }
        } catch (Throwable unused3) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                }
            }
        }
    }

    public static boolean zn(com.bytedance.sdk.component.adexpress.zmn.zn.zmn zmnVar, com.bytedance.sdk.component.adexpress.zmn.zn.zmn zmnVar2) {
        if (zmnVar != null) {
            try {
                if (!TextUtils.isEmpty(zmnVar.zn())) {
                    if (zmnVar2 == null) {
                        return false;
                    }
                    String nps = zmnVar.nps();
                    String nps2 = zmnVar2.nps();
                    if ((!TextUtils.isEmpty(nps2) && !nps2.equals(nps)) || zmn(zmnVar.zn(), zmnVar2.zn())) {
                        return true;
                    }
                    Map<String, com.bytedance.sdk.component.adexpress.zmn.zn.zmn> zmn = zmnVar.zmn();
                    Map<String, com.bytedance.sdk.component.adexpress.zmn.zn.zmn> zmn2 = zmnVar2.zmn();
                    if (zmn.isEmpty()) {
                        return !zmn2.isEmpty();
                    }
                    if (zmn2.isEmpty()) {
                        return false;
                    }
                    return zmn(zmn, zmn2);
                }
            } catch (Throwable th) {
                th.getMessage();
                return false;
            }
        }
        return true;
    }

    private static boolean zmn(Map<String, com.bytedance.sdk.component.adexpress.zmn.zn.zmn> map, Map<String, com.bytedance.sdk.component.adexpress.zmn.zn.zmn> map2) {
        if (map.size() != map2.size()) {
            return true;
        }
        for (String str : map2.keySet()) {
            com.bytedance.sdk.component.adexpress.zmn.zn.zmn zmnVar = map.get(str);
            if (zmnVar == null) {
                return true;
            }
            com.bytedance.sdk.component.adexpress.zmn.zn.zmn zmnVar2 = map2.get(str);
            if (zmnVar2 == null) {
                return false;
            }
            if (zmn(zmnVar.zn(), zmnVar2.zn())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zmn(String str, String str2) {
        String[] split = str2.split("\\.");
        String[] split2 = str.split("\\.");
        int min = Math.min(split.length, split2.length);
        int i = 0;
        while (true) {
            if (i >= min) {
                break;
            }
            int length = split[i].length() - split2[i].length();
            if (length == 0) {
                int compareTo = split[i].compareTo(split2[i]);
                if (compareTo > 0) {
                    return true;
                }
                if (compareTo < 0) {
                    return false;
                }
                if (i == min - 1) {
                    return split.length > split2.length;
                }
                i++;
            } else if (length > 0) {
                return true;
            }
        }
    }

    public static boolean zmn(com.bytedance.sdk.component.adexpress.zmn.zn.zmn zmnVar, String str) {
        if (zmnVar == null) {
            return true;
        }
        try {
            if (TextUtils.isEmpty(zmnVar.zn())) {
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return zmn(zmnVar.zn(), str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void fs(File file, com.bytedance.sdk.component.adexpress.zmn.zn.zmn zmnVar, String str) {
        if (zmnVar == null || file == null) {
            return;
        }
        try {
            new File(file, str).delete();
        } catch (Throwable unused) {
        }
        if (zmnVar.hhw() != null) {
            Iterator<zmn.C0126zmn> it = zmnVar.hhw().iterator();
            while (it.hasNext()) {
                try {
                    new File(file, com.bytedance.sdk.component.utils.btk.zmn(it.next().zmn())).delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }
}
