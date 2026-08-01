package com.bykv.vk.openvk.preload.geckox.d;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.model.ComponentModel;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import java.io.File;
import java.io.FileFilter;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: GetServerChannelVersionInterceptorMulti.java */
/* loaded from: classes.dex */
public class c extends com.bykv.vk.openvk.preload.b.d<Map<String, List<Pair<String, Long>>>, List<UpdatePackage>> {
    private com.bykv.vk.openvk.preload.geckox.b g;
    private Map<String, Map<String, Object>> h;
    private Map<String, List<CheckRequestBodyModel.TargetChannel>> i;
    private com.bykv.vk.openvk.preload.geckox.e.a j;
    private String k;
    private com.bykv.vk.openvk.preload.geckox.statistic.model.b l = new com.bykv.vk.openvk.preload.geckox.statistic.model.b();

    @Override // com.bykv.vk.openvk.preload.b.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.g = (com.bykv.vk.openvk.preload.geckox.b) objArr[0];
        this.h = (Map) objArr[1];
        this.i = (Map) objArr[2];
        this.j = (com.bykv.vk.openvk.preload.geckox.e.a) objArr[3];
        this.k = (String) objArr[4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.b.d
    public Object a(com.bykv.vk.openvk.preload.b.b<List<UpdatePackage>> bVar, Map<String, List<Pair<String, Long>>> map) throws Throwable {
        List<Pair<String, com.bykv.vk.openvk.preload.geckox.g.a>> list;
        char c = 2;
        int i = 0;
        char c2 = 1;
        GeckoLogger.d("gecko-debug-tag", "start get server channel version[v3]... local channel version:", map);
        Map<String, List<UpdatePackage>> a2 = a(map);
        com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.g, this.l);
        Iterator<Map.Entry<String, List<UpdatePackage>>> it = a2.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<UpdatePackage> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                UpdatePackage next = it2.next();
                long localVersion = next.getLocalVersion();
                long version = next.getVersion();
                if (version < localVersion) {
                    Object[] objArr = new Object[5];
                    objArr[i] = next.getChannel();
                    objArr[c2] = "rollback：";
                    objArr[c] = Long.valueOf(localVersion);
                    objArr[3] = "->";
                    objArr[4] = Long.valueOf(version);
                    GeckoLogger.d("gecko-debug-tag", objArr);
                    File[] listFiles = new File(this.g.n, next.getAccessKey() + File.separator + next.getChannel()).listFiles(new FileFilter() { // from class: com.bykv.vk.openvk.preload.geckox.d.c.1
                        @Override // java.io.FileFilter
                        public final boolean accept(File file) {
                            return file.isDirectory();
                        }
                    });
                    if (listFiles == null || listFiles.length == 0) {
                        c = 2;
                        c2 = 1;
                        i = 0;
                    } else {
                        int length = listFiles.length;
                        int i2 = i;
                        while (i2 < length) {
                            File file = listFiles[i2];
                            try {
                                long parseLong = Long.parseLong(file.getName());
                                if (parseLong > version) {
                                    final File file2 = new File(file.getParent(), file.getName() + "--pending-delete");
                                    file.renameTo(file2);
                                    com.bykv.vk.openvk.preload.geckox.utils.e.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.d.c.2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            com.bykv.vk.openvk.preload.geckox.utils.c.a(file2);
                                        }
                                    });
                                } else if (parseLong == version) {
                                    it2.remove();
                                }
                            } catch (Exception unused) {
                            }
                            i2++;
                            c = 2;
                            c2 = 1;
                            i = 0;
                        }
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, List<UpdatePackage>>> it3 = a2.entrySet().iterator();
        while (it3.hasNext()) {
            arrayList.addAll(it3.next().getValue());
        }
        Object obj = null;
        try {
            list = c(arrayList);
            try {
                obj = bVar.a((com.bykv.vk.openvk.preload.b.b<List<UpdatePackage>>) arrayList);
                b(list);
                GeckoLogger.d("gecko-debug-tag", "all channel update finished");
            } catch (Throwable th) {
                th = th;
                try {
                    GeckoLogger.e("gecko-debug-tag", "filterChannel:", th);
                    b(list);
                    GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                    a(arrayList);
                    return obj;
                } catch (Throwable th2) {
                    b(list);
                    GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            list = null;
        }
        a(arrayList);
        return obj;
    }

    private void a(List<UpdatePackage> list) {
        if (list.isEmpty()) {
            return;
        }
        for (UpdatePackage updatePackage : list) {
            com.bykv.vk.openvk.preload.geckox.a.c.a(new File(new File(this.g.n, updatePackage.getAccessKey()), updatePackage.getChannel()).getAbsolutePath());
        }
    }

    private static void b(List<Pair<String, com.bykv.vk.openvk.preload.geckox.g.a>> list) {
        if (list == null) {
            return;
        }
        Iterator<Pair<String, com.bykv.vk.openvk.preload.geckox.g.a>> it = list.iterator();
        while (it.hasNext()) {
            try {
                ((com.bykv.vk.openvk.preload.geckox.g.a) it.next().second).a();
            } catch (Exception e) {
                GeckoLogger.e("gecko-debug-tag", "releaseLock:", e);
            }
        }
    }

    private List<Pair<String, com.bykv.vk.openvk.preload.geckox.g.a>> c(List<UpdatePackage> list) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (UpdatePackage updatePackage : list) {
            try {
                File file = new File(new File(this.g.n, updatePackage.getAccessKey()), updatePackage.getChannel());
                if (file.isFile()) {
                    com.bykv.vk.openvk.preload.geckox.utils.c.a(file);
                }
                if (!file.mkdirs() && !file.isDirectory()) {
                    GeckoLogger.d("gecko-debug-tag", "can not create channel dir：", file.getAbsolutePath());
                    throw new RuntimeException("can not create channel dir:" + file.getAbsolutePath());
                }
                com.bykv.vk.openvk.preload.geckox.g.a a2 = com.bykv.vk.openvk.preload.geckox.g.a.a(file.getAbsolutePath() + File.separator + "update.lock");
                if (a2 != null) {
                    arrayList.add(new Pair(updatePackage.getChannel(), a2));
                    arrayList2.add(updatePackage);
                } else {
                    com.bykv.vk.openvk.preload.geckox.e.a aVar = this.j;
                    updatePackage.getChannel();
                }
            } catch (Exception e) {
                GeckoLogger.e("gecko-debug-tag", "filterChannel:", e);
                updatePackage.getChannel();
                com.bykv.vk.openvk.preload.geckox.e.a aVar2 = this.j;
            }
        }
        list.clear();
        list.addAll(arrayList2);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Map<String, List<UpdatePackage>> a(Map<String, List<Pair<String, Long>>> map) throws Exception {
        Object a2;
        String b2 = b(map);
        String str = "https://" + this.g.k + "/gecko/server/v3/package";
        try {
            this.l.f = com.bykv.vk.openvk.preload.geckox.utils.h.a(this.g.a);
            Response doPost = this.g.d.doPost(str, b2);
            this.l.g = doPost.code;
            this.l.d = doPost.msg;
            com.bykv.vk.openvk.preload.geckox.statistic.model.b bVar = this.l;
            Map<String, String> map2 = doPost.headers;
            String str2 = "";
            if (map2 != null && !map2.isEmpty()) {
                String str3 = map2.get("x-tt-logid");
                if (TextUtils.isEmpty(str3)) {
                    str3 = map2.get("X-Tt-Logid");
                    if (TextUtils.isEmpty(str3)) {
                        String str4 = map2.get("X-TT-LOGID");
                        if (!TextUtils.isEmpty(str4)) {
                            str2 = str4;
                        }
                    }
                }
                str2 = str3;
            }
            bVar.e = str2;
            if (doPost.code == 200) {
                String str5 = doPost.body;
                GeckoLogger.d("gecko-debug-tag", "response:", str5);
                try {
                    Type type = new com.bykv.vk.openvk.preload.a.c.a<com.bykv.vk.openvk.preload.geckox.model.Response<ComponentModel>>() { // from class: com.bykv.vk.openvk.preload.geckox.d.c.3
                    }.c;
                    com.bykv.vk.openvk.preload.a.f fVar = com.bykv.vk.openvk.preload.geckox.c.b.a().a;
                    if (str5 == null) {
                        a2 = null;
                    } else {
                        com.bykv.vk.openvk.preload.a.d.a aVar = new com.bykv.vk.openvk.preload.a.d.a(new StringReader(str5));
                        aVar.a = fVar.j;
                        a2 = fVar.a(aVar, type);
                        com.bykv.vk.openvk.preload.a.f.a(a2, aVar);
                    }
                    com.bykv.vk.openvk.preload.geckox.model.Response response = (com.bykv.vk.openvk.preload.geckox.model.Response) a2;
                    if (response.status == 0) {
                        if (response.data == 0) {
                            this.l.d = "check update error：response.data==null";
                            com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.g, this.l);
                            throw new a("check update error：response.data==null");
                        }
                        com.bykv.vk.openvk.preload.geckox.a.a.a(this.g.a, ((ComponentModel) response.data).getUniversalStrategies(), this.g.n, this.j);
                        Map<String, List<UpdatePackage>> packages = ((ComponentModel) response.data).getPackages();
                        if (packages == null || packages.isEmpty()) {
                            com.bykv.vk.openvk.preload.geckox.a.a.a(this.g);
                            return new HashMap();
                        }
                        for (String str6 : this.g.e) {
                            List<UpdatePackage> list = packages.get(str6);
                            if (list != null && !list.isEmpty()) {
                                for (UpdatePackage updatePackage : list) {
                                    updatePackage.setAccessKey(str6);
                                    updatePackage.setLocalVersion(a(map.get(str6), updatePackage.getChannel()));
                                }
                            }
                        }
                        return packages;
                    }
                    if (response.status == 2000) {
                        com.bykv.vk.openvk.preload.geckox.a.a.a(this.g);
                        return new HashMap();
                    }
                    String str7 = "check update error，unknow status code，response.status：" + response.status;
                    this.l.d = str7;
                    com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.g, this.l);
                    throw new a(str7);
                } catch (Throwable th) {
                    this.l.d = "json parse failed：" + th.getMessage();
                    com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.g, this.l);
                    throw new b("json parse failed：" + str5 + " caused by:" + th.getMessage(), th);
                }
            }
            throw new NetworkErrorException("net work get failed, code: " + doPost.code + ", url:" + str);
        } catch (Exception e) {
            com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.g, this.l);
            throw new C0028c("request failed：url:" + str + ", caused by:" + e.getMessage(), e);
        }
    }

    private static long a(List<Pair<String, Long>> list, String str) {
        for (Pair<String, Long> pair : list) {
            if (((String) pair.first).equals(str)) {
                return ((Long) pair.second).longValue();
            }
        }
        return 0L;
    }

    private String b(Map<String, List<Pair<String, Long>>> map) {
        List<CheckRequestBodyModel.TargetChannel> list;
        CheckRequestBodyModel checkRequestBodyModel = new CheckRequestBodyModel();
        Context context = this.g.a;
        checkRequestBodyModel.setCommon(new Common(this.g.h.longValue(), this.g.i, this.g.j, com.bykv.vk.openvk.preload.geckox.utils.a.b(context), com.bykv.vk.openvk.preload.geckox.utils.h.a(context), this.g.m, this.g.l));
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<Pair<String, Long>>> entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Pair<String, Long> pair : entry.getValue()) {
                CheckRequestBodyModel.LocalChannel localChannel = new CheckRequestBodyModel.LocalChannel();
                localChannel.localVersion = (Long) pair.second;
                hashMap2.put(pair.first, localChannel);
            }
            hashMap.put(entry.getKey(), hashMap2);
        }
        try {
            com.bykv.vk.openvk.preload.a.f fVar = com.bykv.vk.openvk.preload.geckox.c.b.a().a;
            this.l.a = fVar.a(hashMap);
            checkRequestBodyModel.setLocal(hashMap);
            HashMap hashMap3 = new HashMap();
            for (String str : this.g.e) {
                CheckRequestBodyModel.Group group = new CheckRequestBodyModel.Group();
                group.groupName = this.k;
                Map<String, List<CheckRequestBodyModel.TargetChannel>> map2 = this.i;
                if (map2 != null && !map2.isEmpty() && (list = this.i.get(str)) != null && !list.isEmpty()) {
                    group.targetChannels = new ArrayList();
                    group.targetChannels.addAll(list);
                }
                hashMap3.put(str, group);
            }
            this.l.b = fVar.a(hashMap3);
            checkRequestBodyModel.setDeployments(hashMap3);
            Map<String, Map<String, Object>> map3 = this.h;
            if (map3 != null) {
                this.l.c = fVar.a(map3);
                checkRequestBodyModel.setCustom(this.h);
            }
            return fVar.a(checkRequestBodyModel);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* compiled from: GetServerChannelVersionInterceptorMulti.java */
    /* renamed from: com.bykv.vk.openvk.preload.geckox.d.c$c, reason: collision with other inner class name */
    public static class C0028c extends RuntimeException {
        C0028c(String str, Throwable th) {
            super(str, th);
        }
    }

    /* compiled from: GetServerChannelVersionInterceptorMulti.java */
    public static class b extends RuntimeException {
        b(String str, Throwable th) {
            super(str, th);
        }
    }

    /* compiled from: GetServerChannelVersionInterceptorMulti.java */
    public static class a extends RuntimeException {
        a(String str) {
            super(str);
        }
    }
}
