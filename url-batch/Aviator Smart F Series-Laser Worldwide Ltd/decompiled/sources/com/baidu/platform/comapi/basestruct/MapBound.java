package com.baidu.platform.comapi.basestruct;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class MapBound implements Serializable {
    public Point leftBottomPt = new Point();
    public Point rightTopPt = new Point();

    public MapBound() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapBound)) {
            return false;
        }
        MapBound mapBound = (MapBound) obj;
        Point point = this.leftBottomPt;
        if (point == null ? mapBound.leftBottomPt != null : !point.equals(mapBound.leftBottomPt)) {
            return false;
        }
        Point point2 = this.rightTopPt;
        Point point3 = mapBound.rightTopPt;
        if (point2 != null) {
            if (point2.equals(point3)) {
                return true;
            }
        } else if (point3 == null) {
            return true;
        }
        return false;
    }

    public Point getCenterPt() {
        return new Point((this.leftBottomPt.getIntX() + this.rightTopPt.getIntX()) / 2, (this.leftBottomPt.getIntY() + this.rightTopPt.getIntY()) / 2);
    }

    public int hashCode() {
        Point point = this.leftBottomPt;
        int hashCode = (point != null ? point.hashCode() : 0) * 31;
        Point point2 = this.rightTopPt;
        return hashCode + (point2 != null ? point2.hashCode() : 0);
    }

    public void setLeftBottomPt(int i8, int i9) {
        this.leftBottomPt.setTo(i8, i9);
    }

    public void setRightTopPt(int i8, int i9) {
        this.rightTopPt.setTo(i8, i9);
    }

    public String toQuery() {
        return String.format("(%d,%d;%d,%d)", Integer.valueOf(this.leftBottomPt.getIntX()), Integer.valueOf(this.leftBottomPt.getIntY()), Integer.valueOf(this.rightTopPt.getIntX()), Integer.valueOf(this.rightTopPt.getIntY()));
    }

    public String toString() {
        return "MapBound{leftBottomPt=" + this.leftBottomPt + ", rightTopPt=" + this.rightTopPt + '}';
    }

    public void setLeftBottomPt(Point point) {
        this.leftBottomPt.setTo(point);
    }

    public void setRightTopPt(Point point) {
        this.rightTopPt.setTo(point);
    }

    public MapBound(int i8, int i9, int i10, int i11) {
        setLeftBottomPt(i8, i9);
        setRightTopPt(i10, i11);
    }
}
