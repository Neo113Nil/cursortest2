package com.baidu.mapapi.map;

import android.util.Log;
import com.baidu.mapapi.common.Logger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public final class TileOverlay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f6374a = "TileOverlay";

    /* renamed from: b, reason: collision with root package name */
    private static int f6375b;

    /* renamed from: c, reason: collision with root package name */
    BaiduMap f6376c;

    /* renamed from: g, reason: collision with root package name */
    private TileProvider f6380g;

    /* renamed from: e, reason: collision with root package name */
    private HashMap<String, Tile> f6378e = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private HashSet<String> f6379f = new HashSet<>();

    /* renamed from: d, reason: collision with root package name */
    private ExecutorService f6377d = Executors.newFixedThreadPool(1);

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f6381a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6382b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6383c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f6384d;

        a(int i8, int i9, int i10, String str) {
            this.f6381a = i8;
            this.f6382b = i9;
            this.f6383c = i10;
            this.f6384d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Tile tile = ((FileTileProvider) TileOverlay.this.f6380g).getTile(this.f6381a, this.f6382b, this.f6383c);
            if (tile == null) {
                Log.e(TileOverlay.f6374a, "FileTile pic is null");
            } else if (tile.width == 256 && tile.height == 256) {
                TileOverlay.this.a(this.f6381a + "_" + this.f6382b + "_" + this.f6383c, tile);
            } else {
                Log.e(TileOverlay.f6374a, "FileTile pic must be 256 * 256");
            }
            TileOverlay.this.f6379f.remove(this.f6384d);
        }
    }

    public TileOverlay(BaiduMap baiduMap, TileProvider tileProvider) {
        this.f6376c = baiduMap;
        this.f6380g = tileProvider;
    }

    private synchronized boolean c(String str) {
        return this.f6379f.contains(str);
    }

    public boolean clearTileCache() {
        BaiduMap baiduMap = this.f6376c;
        if (baiduMap == null) {
            return false;
        }
        return baiduMap.a();
    }

    public void removeTileOverlay() {
        BaiduMap baiduMap = this.f6376c;
        if (baiduMap == null) {
            return;
        }
        baiduMap.a(this);
    }

    private synchronized Tile b(String str) {
        if (!this.f6378e.containsKey(str)) {
            return null;
        }
        Tile tile = this.f6378e.get(str);
        this.f6378e.remove(str);
        return tile;
    }

    void c() {
        this.f6377d.shutdownNow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(String str, Tile tile) {
        this.f6378e.put(str, tile);
    }

    private synchronized void a(String str) {
        this.f6379f.add(str);
    }

    synchronized void b() {
        Logger.logE(f6374a, "clearTaskSet");
        this.f6379f.clear();
        this.f6378e.clear();
    }

    Tile a(int i8, int i9, int i10) {
        String str = i8 + "_" + i9 + "_" + i10;
        Tile b8 = b(str);
        if (b8 != null) {
            return b8;
        }
        BaiduMap baiduMap = this.f6376c;
        if (baiduMap != null && f6375b == 0) {
            WinRound winRound = baiduMap.getMapStatus().f5948c.f8157j;
            f6375b = (((winRound.right - winRound.left) / 256) + 2) * (((winRound.bottom - winRound.top) / 256) + 2);
        }
        if (this.f6378e.size() > f6375b) {
            b();
        }
        if (c(str) || this.f6377d.isShutdown()) {
            return null;
        }
        try {
            a(str);
            this.f6377d.execute(new a(i8, i9, i10, str));
            return null;
        } catch (RejectedExecutionException unused) {
            Log.e(f6374a, "ThreadPool excepiton");
            return null;
        } catch (Exception unused2) {
            Log.e(f6374a, "fileDir is not legal");
            return null;
        }
    }
}
