package com.startapp.sdk.internal;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.UShort;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class wd {
    public static xd a(File file, String str, String str2, List list) {
        byte[] bArr;
        byte[] bArr2;
        file.getClass();
        list.getClass();
        try {
            if (str != null) {
                bArr = str.getBytes(Charsets.UTF_8);
                bArr.getClass();
            } else {
                bArr = new byte[0];
            }
            if (str2 != null) {
                bArr2 = str2.getBytes(Charsets.UTF_8);
                bArr2.getClass();
            } else {
                bArr2 = new byte[0];
            }
            int length = bArr.length + 5 + bArr2.length + 2;
            ByteBuffer allocate = ByteBuffer.allocate((list.size() * 12) + length);
            allocate.put((byte) 1);
            allocate.putShort((short) bArr.length);
            allocate.put(bArr);
            allocate.putShort((short) bArr2.length);
            allocate.put(bArr2);
            allocate.putShort((short) list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                vd vdVar = (vd) it.next();
                allocate.putInt(vdVar.f468a);
                allocate.putInt(vdVar.b);
                allocate.putInt(vdVar.c);
            }
            allocate.flip();
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.getChannel().write(allocate, 0L);
            randomAccessFile.getChannel().force(false);
            return new xd(str, str2, list, randomAccessFile, length);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static xd a(File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            long size = channel.size();
            if (size < 7) {
                randomAccessFile.close();
                return null;
            }
            ByteBuffer allocate = ByteBuffer.allocate((int) size);
            channel.read(allocate, 0L);
            allocate.flip();
            if (allocate.get() != 1) {
                randomAccessFile.close();
                return null;
            }
            int i = allocate.getShort() & UShort.MAX_VALUE;
            if (allocate.remaining() < i) {
                randomAccessFile.close();
                return null;
            }
            byte[] bArr = new byte[i];
            allocate.get(bArr);
            String str = i > 0 ? new String(bArr, Charsets.UTF_8) : null;
            int i2 = allocate.getShort() & UShort.MAX_VALUE;
            if (allocate.remaining() < i2) {
                randomAccessFile.close();
                return null;
            }
            byte[] bArr2 = new byte[i2];
            allocate.get(bArr2);
            String str2 = i2 > 0 ? new String(bArr2, Charsets.UTF_8) : null;
            int i3 = 65535 & allocate.getShort();
            if (allocate.remaining() < i3 * 12) {
                randomAccessFile.close();
                return null;
            }
            IntRange until = RangesKt.until(0, i3);
            String str3 = str;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                ((IntIterator) it).nextInt();
                arrayList.add(new vd(allocate.getInt(), allocate.getInt(), allocate.getInt()));
            }
            return new xd(str3, str2, arrayList, randomAccessFile, i + 5 + i2 + 2);
        } catch (Throwable unused) {
            return null;
        }
    }
}
