package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class ep {

    /* renamed from: a, reason: collision with root package name */
    private final int f4690a;

    /* renamed from: b, reason: collision with root package name */
    private final bp f4691b = new gp();

    public ep(int i7) {
        this.f4690a = i7;
    }

    public final String a(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            sb.append(arrayList.get(i7).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        dp dpVar = new dp();
        PriorityQueue priorityQueue = new PriorityQueue(this.f4690a, new cp(this));
        for (String str : split) {
            String[] b7 = fp.b(str, false);
            if (b7.length != 0) {
                jp.c(b7, this.f4690a, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                dpVar.f4267b.write(this.f4691b.b(((ip) it.next()).f6732b));
            } catch (IOException e7) {
                io0.e("Error while writing hash to byteStream", e7);
            }
        }
        return dpVar.toString();
    }
}
