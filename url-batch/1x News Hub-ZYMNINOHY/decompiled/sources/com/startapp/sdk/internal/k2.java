package com.startapp.sdk.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import android.webkit.URLUtil;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class k2 {
    public static Bitmap a(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Bitmap b(String str) {
        Bitmap bitmap;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        r0 = null;
        r0 = null;
        r0 = null;
        Bitmap bitmap2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        } catch (Throwable unused) {
            bitmap = null;
        }
        try {
            httpURLConnection.connect();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
            try {
                bitmap2 = BitmapFactory.decodeStream(bufferedInputStream);
                bufferedInputStream.close();
                httpURLConnection.disconnect();
                return bitmap2;
            } finally {
            }
        } catch (Throwable unused2) {
            Bitmap bitmap3 = bitmap2;
            httpURLConnection2 = httpURLConnection;
            bitmap = bitmap3;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            return bitmap;
        }
    }

    public static BitmapDrawable a(Resources resources) {
        return new BitmapDrawable(resources, a("iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA39pVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuNi1jMDY3IDc5LjE1Nzc0NywgMjAxNS8wMy8zMC0yMzo0MDo0MiAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDozODRkZTAxYi00OWRkLWM4NDYtYThkNC0wZWRiMDMwYTZlODAiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6QkE0Q0U2MUY2QzA0MTFFNUE3MkJGQjQ1MTkzOEYxQUUiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6QkE0Q0U2MUU2QzA0MTFFNUE3MkJGQjQ1MTkzOEYxQUUiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENDIChXaW5kb3dzKSI+IDx4bXBNTTpEZXJpdmVkRnJvbSBzdFJlZjppbnN0YW5jZUlEPSJ4bXAuaWlkOjlkZjAyMGU0LTNlYmUtZTY0ZC04YjRiLWM5ZWY4MTU4ZjFhYyIgc3RSZWY6ZG9jdW1lbnRJRD0iYWRvYmU6ZG9jaWQ6cGhvdG9zaG9wOmU1MzEzNDdlLTZjMDEtMTFlNS1hZGZlLThmMTBjZWYxMGRiZSIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/PngNsEEAAANeSURBVHjatFfNS1tBEH+pUZOQ0B4i3sTSxHMRFNQoFBEP7dHgvyDiKWgguQra9F+oxqNiwOTQ+oFI1ZM3jSf1YK5FL41ooaKZzu+x+4gv2bx9Rgd+JNn5zO7s7IzH0CQiCvLHZ8YnxkfGe8ZbwS4zSowTxi/GT4/Hc2u8BLHjCOM745b06VboRJpx7GN8ZfyDxUqlQgcHB5RMJmloaIg6Ozupra3NBL5jDTzIQFYQdDOw5db5B8YxLDw+PtLKygr19PQQWDqIRqOUzWZNXUHH2rvBgr2M39C6uLig/v5+bcd2QLdUKskgYLNX57yvIL2zs0OhUOjZziU6Ojro8PBQBnGl3Alm+BknkMI54mybdS4BW3t7ezKIInzVCwDJYm4Zon4p5xLYzfPzcxlEpl7S3SNpmjlznZwQiXn/5CjEnTUzt5GBsbExamlpUfLBg0wjG8vLy3IXlqTzEAoH7m4kElEqTk1Nmfd7bW2tbhBYAw8ykFXZgQ9RJ1CsQghgEr/29/eVStPT09XFhdbX18nr9Vr81tZWyuVyFh+yMzMzSnvwJWjyDS+MYic2NzeV17O7u9vg2m79jsfjBv9bg7PbxOrqqjExMWHxIdvV1aW0V+VrFDtwhFCGh4cbnl0mk6kp+BsbGybsBNlGtkZGRqToEQK4xjfUc6csXlhYcHyFFhcXHe3Al6BrQz427e3tWldpfn5e6Rw83cIkHyvXAUAZb4SdsKZbPe0BaB+Bz+cjTiDlDmxtbZkybo9AKwn9fj9tb2875gBkINvIFnzJJMQ1PMV9GBgYUF6bQCBgFAoFY3x8/Ml6KpUy0un0kzXIQBY6KqrydapViPL5fM0/Rfcj+fhuJw5CqxBpleJYLEY3NzeW8dnZ2RoZrEmCLHQcSvGdWYrFe7CEFTwUqqjR85XLZUokEkoZ8CADWe3HqKoTcnyOdW5KI5m+vj56eHiQz3G0bkNyeXn5ag3J2dmZ/PffVC1Z8bVast3d3eqWLKDVlAaDwaadh8Nhvaa0XluOHg7n9lzn0MWRarfltp0oysEErRqGDTeDCbK9ajApuh7TxGiWERlrjWZzc3M0ODhYM5phDTzbaHb/rNHMFkhUNK13LobTv6K2RJ3se1yO519s4/k7wf5jG89/6I7n/wUYAGo3YtcprD4sAAAAAElFTkSuQmCC"));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[Catch: all -> 0x0059, TRY_LEAVE, TryCatch #3 {all -> 0x0059, blocks: (B:12:0x0042, B:15:0x0049, B:18:0x0055, B:23:0x0064, B:26:0x0061, B:22:0x005c, B:17:0x004e), top: B:11:0x0042, inners: #0, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap a(Context context, String str) {
        Bitmap bitmap;
        File b3;
        Bitmap bitmap2 = null;
        bitmap2 = null;
        bitmap2 = null;
        bitmap2 = null;
        bitmap2 = null;
        bitmap2 = null;
        bitmap2 = null;
        File file = null;
        if (URLUtil.isValidUrl(str)) {
            try {
                File b4 = b(context, str);
                if (b4 != null) {
                    try {
                        if (b4.exists()) {
                            FileInputStream fileInputStream = new FileInputStream(b4);
                            try {
                                bitmap2 = BitmapFactory.decodeStream(fileInputStream);
                                fileInputStream.close();
                            } finally {
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        Bitmap bitmap3 = bitmap2;
                        file = b4;
                        bitmap = bitmap3;
                        d9.a(th);
                        if (file != null) {
                            file.delete();
                        }
                        bitmap2 = bitmap;
                        if (bitmap2 == null) {
                            try {
                                b3 = b(context, str);
                                if (b3 == null) {
                                }
                            } catch (Throwable th2) {
                                d9.a(th2);
                            }
                        }
                        return bitmap2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bitmap = null;
            }
            if (bitmap2 == null && (bitmap2 = b(str)) != null) {
                b3 = b(context, str);
                if (b3 == null) {
                    FileOutputStream fileOutputStream = new FileOutputStream(b3);
                    try {
                        bitmap2.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.close();
                    } finally {
                    }
                }
            }
        }
        return bitmap2;
    }

    public static File b(Context context, String str) {
        String d3;
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            URL url = new URL(str);
            WeakHashMap weakHashMap = si.f4438a;
            d3 = si.d(url.getHost() + url.getPath());
        } catch (MalformedURLException unused) {
            d3 = si.d(str);
        }
        File file = new File(context.getCacheDir(), "StartIoAssets");
        if (file.exists() || file.mkdirs()) {
            return new File(file, d3);
        }
        return null;
    }
}
