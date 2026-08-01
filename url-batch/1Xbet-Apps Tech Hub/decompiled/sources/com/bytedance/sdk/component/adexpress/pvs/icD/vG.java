package com.bytedance.sdk.component.adexpress.pvs.icD;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.adexpress.pvs.vG.pvs;
import com.bytedance.sdk.component.utils.CvL;
import com.bytedance.sdk.component.utils.Ju;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: TemplateCacheBaseApi.java */
/* loaded from: classes.dex */
public abstract class vG {
    public abstract File pvs();

    protected boolean pvs(Map<String, com.bytedance.sdk.component.adexpress.pvs.vG.pvs> map) {
        if (map == null || map.size() == 0) {
            return false;
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            com.bytedance.sdk.component.adexpress.pvs.vG.pvs pvsVar = map.get(it.next());
            if (pvsVar != null && !pvs(pvsVar.sUS())) {
                return false;
            }
        }
        return true;
    }

    protected boolean pvs(List<pvs.C0043pvs> list) {
        if (list == null || list.size() <= 0 || pvs() == null) {
            return false;
        }
        for (pvs.C0043pvs c0043pvs : list) {
            String pvs = com.bytedance.sdk.component.utils.NB.pvs(c0043pvs.pvs());
            if (TextUtils.isEmpty(pvs)) {
                return false;
            }
            File file = new File(pvs(), pvs);
            String pvs2 = com.bytedance.sdk.component.utils.NB.pvs(file);
            if (!file.exists() || !file.isFile() || c0043pvs.icD() == null || !c0043pvs.icD().equals(pvs2)) {
                return false;
            }
        }
        return true;
    }

    protected boolean pvs(pvs.icD icd) {
        if (icd == null || pvs() == null) {
            return false;
        }
        List<Pair<String, String>> icD = icd.icD();
        if (icD == null || icD.size() <= 0) {
            return true;
        }
        Iterator<Pair<String, String>> it = icD.iterator();
        while (it.hasNext()) {
            File file = new File(pvs(), (String) it.next().first);
            if (!file.exists() || !file.isFile()) {
                return false;
            }
        }
        return true;
    }

    public List<pvs.C0043pvs> pvs(com.bytedance.sdk.component.adexpress.pvs.vG.pvs pvsVar, com.bytedance.sdk.component.adexpress.pvs.vG.pvs pvsVar2) {
        Map<String, com.bytedance.sdk.component.adexpress.pvs.vG.pvs> pvs = pvsVar.pvs();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (pvs.size() == 0) {
            if (pvsVar2 != null && pvsVar2.pvs().size() != 0) {
                Map<String, com.bytedance.sdk.component.adexpress.pvs.vG.pvs> pvs2 = pvsVar2.pvs();
                Iterator<String> it = pvs2.keySet().iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.pvs.vG.pvs pvsVar3 = pvs2.get(it.next());
                    if (pvsVar3 != null) {
                        arrayList.addAll(pvsVar3.sUS());
                    }
                }
            }
        } else if (pvsVar2 == null || pvsVar2.pvs().size() == 0) {
            if (pvs.size() != 0) {
                Iterator<String> it2 = pvs.keySet().iterator();
                while (it2.hasNext()) {
                    com.bytedance.sdk.component.adexpress.pvs.vG.pvs pvsVar4 = pvs.get(it2.next());
                    if (pvsVar4 != null) {
                        arrayList2.addAll(pvsVar4.sUS());
                    }
                }
            }
        } else {
            Map<String, com.bytedance.sdk.component.adexpress.pvs.vG.pvs> pvs3 = pvsVar2.pvs();
            for (String str : pvs.keySet()) {
                com.bytedance.sdk.component.adexpress.pvs.vG.pvs pvsVar5 = pvs.get(str);
                com.bytedance.sdk.component.adexpress.pvs.vG.pvs pvsVar6 = pvs3.get(str);
                if (pvsVar6 == null && pvsVar5 != null) {
                    arrayList2.addAll(pvsVar5.sUS());
                } else if (pvsVar5 == null && pvsVar6 != null) {
                    arrayList.addAll(pvsVar6.sUS());
                } else if (pvsVar5 != null) {
                    for (pvs.C0043pvs c0043pvs : pvsVar5.sUS()) {
                        if (c0043pvs != null && !pvsVar6.sUS().contains(c0043pvs) && c0043pvs.icD() != null && c0043pvs.pvs() != null) {
                            arrayList2.add(c0043pvs);
                        }
                    }
                    for (pvs.C0043pvs c0043pvs2 : pvsVar6.sUS()) {
                        if (c0043pvs2 != null && !pvsVar5.sUS().contains(c0043pvs2)) {
                            arrayList.add(c0043pvs2);
                        }
                    }
                }
            }
        }
        if (pvs(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    private boolean pvs(List<pvs.C0043pvs> list, List<pvs.C0043pvs> list2) {
        for (pvs.C0043pvs c0043pvs : list) {
            String pvs = c0043pvs.pvs();
            String pvs2 = com.bytedance.sdk.component.utils.NB.pvs(pvs);
            File file = new File(pvs(), pvs2);
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
            com.bytedance.sdk.component.yiw.icD.pvs sUS = com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().vG().sUS();
            sUS.icD(pvs);
            sUS.pvs(pvs().getAbsolutePath(), pvs2);
            com.bytedance.sdk.component.yiw.icD pvs3 = sUS.pvs();
            list2.add(c0043pvs);
            if (pvs3 == null || !pvs3.sUS() || pvs3.NB() == null || !pvs3.NB().exists()) {
                vG(list2);
                return false;
            }
        }
        return true;
    }

    public List<pvs.C0043pvs> icD(com.bytedance.sdk.component.adexpress.pvs.vG.pvs pvsVar, com.bytedance.sdk.component.adexpress.pvs.vG.pvs pvsVar2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (pvsVar2 == null || pvsVar2.sUS().isEmpty()) {
            arrayList2.addAll(pvsVar.sUS());
        } else if (pvsVar.sUS().isEmpty()) {
            arrayList.addAll(pvsVar2.sUS());
        } else {
            for (pvs.C0043pvs c0043pvs : pvsVar.sUS()) {
                if (!pvsVar2.sUS().contains(c0043pvs) && c0043pvs != null && c0043pvs.pvs() != null && c0043pvs.icD() != null) {
                    arrayList2.add(c0043pvs);
                }
            }
            for (pvs.C0043pvs c0043pvs2 : pvsVar2.sUS()) {
                if (!pvsVar.sUS().contains(c0043pvs2)) {
                    arrayList.add(c0043pvs2);
                }
            }
        }
        if (pvs(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public void icD(List<pvs.C0043pvs> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<pvs.C0043pvs> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(pvs(), com.bytedance.sdk.component.utils.NB.pvs(it.next().pvs()));
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

    public boolean pvs(String str) {
        File file = new File(pvs().getAbsoluteFile(), com.bytedance.sdk.component.utils.NB.pvs(str) + ".zip");
        com.bytedance.sdk.component.yiw.icD.pvs sUS = com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().vG().sUS();
        sUS.icD(str);
        sUS.pvs(file.getParent(), file.getName());
        com.bytedance.sdk.component.yiw.icD pvs = sUS.pvs();
        if (pvs.sUS() && pvs.NB() != null && pvs.NB().exists()) {
            File NB = pvs.NB();
            try {
                CvL.pvs(NB.getAbsolutePath(), file.getParent());
                if (!NB.exists()) {
                    return true;
                }
                NB.delete();
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void pvs(int i) {
        if (com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().Jd() != null) {
            com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().Jd().pvs(i);
        }
    }

    public void vG(List<pvs.C0043pvs> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<pvs.C0043pvs> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(pvs(), com.bytedance.sdk.component.utils.NB.pvs(it.next().pvs()));
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

    public static void pvs(File file, com.bytedance.sdk.component.adexpress.pvs.vG.pvs pvsVar, String str) {
        if (pvsVar == null) {
            return;
        }
        String Mxy = pvsVar.Mxy();
        if (TextUtils.isEmpty(Mxy)) {
            return;
        }
        File file2 = new File(file, str);
        File file3 = new File(file2 + ".tmp");
        if (file3.exists()) {
            file3.delete();
        }
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
            try {
                fileOutputStream2.write(Mxy.getBytes("utf-8"));
                if (file2.exists()) {
                    file2.delete();
                }
                file3.renameTo(file2);
                try {
                    fileOutputStream2.close();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    Ju.pvs("PlayComponentEngineCacheManager", "version save error3", th);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                } catch (Throwable th2) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static boolean vG(com.bytedance.sdk.component.adexpress.pvs.vG.pvs pvsVar, com.bytedance.sdk.component.adexpress.pvs.vG.pvs pvsVar2) {
        if (pvsVar != null) {
            try {
                if (!TextUtils.isEmpty(pvsVar.vG())) {
                    if (pvsVar2 == null) {
                        return false;
                    }
                    if (pvs(pvsVar.vG(), pvsVar2.vG())) {
                        return true;
                    }
                    Map<String, com.bytedance.sdk.component.adexpress.pvs.vG.pvs> pvs = pvsVar.pvs();
                    Map<String, com.bytedance.sdk.component.adexpress.pvs.vG.pvs> pvs2 = pvsVar2.pvs();
                    if (pvs.isEmpty()) {
                        return !pvs2.isEmpty();
                    }
                    if (pvs2.isEmpty()) {
                        return false;
                    }
                    return pvs(pvs, pvs2);
                }
            } catch (Throwable th) {
                th.getMessage();
                return false;
            }
        }
        return true;
    }

    private static boolean pvs(Map<String, com.bytedance.sdk.component.adexpress.pvs.vG.pvs> map, Map<String, com.bytedance.sdk.component.adexpress.pvs.vG.pvs> map2) {
        if (map.size() != map2.size()) {
            return true;
        }
        for (String str : map2.keySet()) {
            com.bytedance.sdk.component.adexpress.pvs.vG.pvs pvsVar = map.get(str);
            if (pvsVar == null) {
                return true;
            }
            com.bytedance.sdk.component.adexpress.pvs.vG.pvs pvsVar2 = map2.get(str);
            if (pvsVar2 == null) {
                return false;
            }
            if (pvs(pvsVar.vG(), pvsVar2.vG())) {
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
    private static boolean pvs(String str, String str2) {
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

    @Deprecated
    public static boolean pvs(com.bytedance.sdk.component.adexpress.pvs.vG.pvs pvsVar, String str) {
        if (pvsVar == null) {
            return true;
        }
        try {
            if (TextUtils.isEmpty(pvsVar.vG())) {
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return pvs(pvsVar.vG(), str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void icD(File file, com.bytedance.sdk.component.adexpress.pvs.vG.pvs pvsVar, String str) {
        if (pvsVar == null || file == null) {
            return;
        }
        try {
            new File(file, str).delete();
        } catch (Throwable unused) {
        }
        if (pvsVar.sUS() != null) {
            Iterator<pvs.C0043pvs> it = pvsVar.sUS().iterator();
            while (it.hasNext()) {
                try {
                    new File(file, com.bytedance.sdk.component.utils.NB.pvs(it.next().pvs())).delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }
}
