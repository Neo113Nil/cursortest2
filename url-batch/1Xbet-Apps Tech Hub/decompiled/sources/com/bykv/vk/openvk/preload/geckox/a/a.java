package com.bykv.vk.openvk.preload.geckox.a;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.model.ComponentModel;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.e;
import com.bykv.vk.openvk.preload.geckox.utils.h;
import com.bykv.vk.openvk.preload.geckox.utils.j;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: AbandonChannelClenUtils.java */
/* loaded from: classes.dex */
public final class a {
    public static void a(final Context context, Map<String, ComponentModel.b> map, File file, final com.bykv.vk.openvk.preload.geckox.e.a aVar) {
        final ArrayList arrayList;
        ComponentModel.b value;
        Iterator<Map.Entry<String, ComponentModel.b>> it;
        Iterator<ComponentModel.a> it2;
        File file2;
        List<Long> b;
        File file3;
        Iterator<Long> it3;
        List<Long> b2;
        Iterator<Map.Entry<String, ComponentModel.b>> it4;
        Iterator<ComponentModel.a> it5;
        File file4;
        String str;
        File file5;
        List<Long> list;
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            arrayList = new ArrayList();
            Iterator<Map.Entry<String, ComponentModel.b>> it6 = map.entrySet().iterator();
            while (it6.hasNext()) {
                Map.Entry<String, ComponentModel.b> next = it6.next();
                String key = next.getKey();
                File file6 = new File(file, key);
                if (file6.isDirectory() && (value = next.getValue()) != null && value.a != null && !value.a.isEmpty()) {
                    List<ComponentModel.a> list2 = value.a;
                    HashSet hashSet = new HashSet();
                    Iterator<ComponentModel.a> it7 = list2.iterator();
                    while (it7.hasNext()) {
                        ComponentModel.a next2 = it7.next();
                        String str2 = next2.a;
                        if (!hashSet.contains(str2)) {
                            hashSet.add(str2);
                            int i = next2.b;
                            List<Long> list3 = next2.c;
                            File file7 = new File(file6, str2);
                            String str3 = "--pending-delete";
                            if (i != 1) {
                                if (i != 2) {
                                    if (i == 3) {
                                        File file8 = new File(file6, str2);
                                        File file9 = new File(file6, str2 + "--pending-delete");
                                        file8.renameTo(file9);
                                        arrayList.add(new C0026a(key, str2, i, 0L, file9));
                                    }
                                } else if (list3 != null && (b2 = j.b(file7)) != null && !b2.isEmpty()) {
                                    for (Long l : b2) {
                                        if (list3.get(0).longValue() > l.longValue()) {
                                            File file10 = new File(file7, l + str3);
                                            new File(file7, String.valueOf(l)).renameTo(file10);
                                            it4 = it6;
                                            it5 = it7;
                                            file4 = file7;
                                            str = str3;
                                            file5 = file6;
                                            list = list3;
                                            arrayList.add(new C0026a(key, str2, i, l.longValue(), file10));
                                        } else {
                                            it4 = it6;
                                            it5 = it7;
                                            file4 = file7;
                                            str = str3;
                                            file5 = file6;
                                            list = list3;
                                        }
                                        it6 = it4;
                                        str3 = str;
                                        list3 = list;
                                        file6 = file5;
                                        file7 = file4;
                                        it7 = it5;
                                    }
                                }
                                it = it6;
                                it2 = it7;
                                file2 = file6;
                            } else {
                                it = it6;
                                it2 = it7;
                                File file11 = file7;
                                file2 = file6;
                                if (list3 != null && (b = j.b(file11)) != null && !b.isEmpty()) {
                                    Iterator<Long> it8 = b.iterator();
                                    while (it8.hasNext()) {
                                        Long next3 = it8.next();
                                        if (list3.contains(next3)) {
                                            File file12 = file11;
                                            File file13 = new File(file12, next3 + "--pending-delete");
                                            new File(file12, String.valueOf(next3)).renameTo(file13);
                                            it3 = it8;
                                            file3 = file12;
                                            arrayList.add(new C0026a(key, str2, i, next3.longValue(), file13));
                                        } else {
                                            file3 = file11;
                                            it3 = it8;
                                        }
                                        it8 = it3;
                                        file11 = file3;
                                    }
                                }
                            }
                            it6 = it;
                            file6 = file2;
                            it7 = it2;
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            arrayList = null;
        }
        if (arrayList == null) {
            return;
        }
        e.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Context context2 = context;
                    List<C0026a> list4 = arrayList;
                    if (list4 != null && !list4.isEmpty()) {
                        for (C0026a c0026a : list4) {
                            File file14 = c0026a.e;
                            long uptimeMillis = SystemClock.uptimeMillis();
                            boolean a = com.bykv.vk.openvk.preload.geckox.utils.c.a(file14);
                            long uptimeMillis2 = SystemClock.uptimeMillis();
                            if (a) {
                                b.a(context2).a(c0026a.a, c0026a.b, c0026a.c, 200, c0026a.d, 0, null, uptimeMillis2 - uptimeMillis);
                            } else {
                                b.a(context2).a(c0026a.a, c0026a.b, c0026a.c, 201, c0026a.d, 601, "delete failed", uptimeMillis2 - uptimeMillis);
                            }
                        }
                    }
                } catch (Exception e2) {
                    GeckoLogger.w("clean-channel", "", e2);
                }
            }
        });
    }

    /* compiled from: AbandonChannelClenUtils.java */
    /* renamed from: com.bykv.vk.openvk.preload.geckox.a.a$a, reason: collision with other inner class name */
    static class C0026a {
        String a;
        String b;
        int c;
        long d;
        File e;

        C0026a(String str, String str2, int i, long j, File file) {
            this.a = str;
            this.b = str2;
            this.c = i;
            this.d = j;
            this.e = file;
        }
    }

    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar) {
        if (bVar.o) {
            Common common = new Common(bVar.h.longValue(), bVar.i, bVar.j, com.bykv.vk.openvk.preload.geckox.utils.a.b(bVar.a), h.a(bVar.a), bVar.m, bVar.l);
            StatisticModel statisticModel = new StatisticModel();
            statisticModel.common = common;
            statisticModel.packages.addAll(b.a(bVar.a).a());
            if (statisticModel.packages.isEmpty()) {
                return;
            }
            String str = "https://" + bVar.k + "/gecko/server/packages/stats";
            try {
                Response doPost = bVar.d.doPost(str, com.bykv.vk.openvk.preload.geckox.c.b.a().a.a(statisticModel));
                if (doPost.code != 200) {
                    throw new NetworkErrorException("net work get failed, code: " + doPost.code + ", url:" + str);
                }
                if (new JSONObject(doPost.body).getInt(NotificationCompat.CATEGORY_STATUS) != 0) {
                    throw new RuntimeException("upload failed");
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
