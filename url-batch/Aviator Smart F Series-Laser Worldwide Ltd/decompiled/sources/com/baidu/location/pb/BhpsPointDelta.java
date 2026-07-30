package com.baidu.location.pb;

import com.github.mikephil.charting.utils.i;
import com.google.protobuf.micro.CodedInputStreamMicro;
import com.google.protobuf.micro.CodedOutputStreamMicro;
import com.google.protobuf.micro.MessageMicro;

/* loaded from: classes2.dex */
public final class BhpsPointDelta extends MessageMicro {
    public static final int ALTITUDE_FIELD_NUMBER = 12;
    public static final int DELTA_LATITUDE_FIELD_NUMBER = 2;
    public static final int DELTA_LONGITUDE_FIELD_NUMBER = 1;
    public static final int DRIVER_STATE_FIELD_NUMBER = 9;
    public static final int GPS_ANGLE_FIELD_NUMBER = 4;
    public static final int GPS_SPEED_FIELD_NUMBER = 3;
    public static final int GPS_STAT_FIELD_NUMBER = 6;
    public static final int GPS_TIME_FIELD_NUMBER = 5;
    public static final int HEIGHT_FIELD_NUMBER = 11;
    public static final int LOCATION_RADIUS_FIELD_NUMBER = 10;
    public static final int TURN_DIR_FIELD_NUMBER = 7;
    public static final int TURN_DIST_FIELD_NUMBER = 8;
    public static final int WALKING_STATE_FIELD_NUMBER = 13;
    private boolean hasAltitude;
    private boolean hasDeltaLatitude;
    private boolean hasDeltaLongitude;
    private boolean hasDriverState;
    private boolean hasGpsAngle;
    private boolean hasGpsSpeed;
    private boolean hasGpsStat;
    private boolean hasGpsTime;
    private boolean hasHeight;
    private boolean hasLocationRadius;
    private boolean hasTurnDir;
    private boolean hasTurnDist;
    private boolean hasWalkingState;
    private double deltaLongitude_ = i.DOUBLE_EPSILON;
    private double deltaLatitude_ = i.DOUBLE_EPSILON;
    private double gpsSpeed_ = i.DOUBLE_EPSILON;
    private double gpsAngle_ = i.DOUBLE_EPSILON;
    private long gpsTime_ = 0;
    private int gpsStat_ = 0;
    private int turnDir_ = 0;
    private int turnDist_ = 0;
    private int driverState_ = 0;
    private int locationRadius_ = 0;
    private int height_ = 0;
    private int altitude_ = 0;
    private int walkingState_ = 0;
    private int cachedSize = -1;

    public static BhpsPointDelta parseFrom(CodedInputStreamMicro codedInputStreamMicro) {
        return new BhpsPointDelta().mergeFrom(codedInputStreamMicro);
    }

    public final BhpsPointDelta clear() {
        clearDeltaLongitude();
        clearDeltaLatitude();
        clearGpsSpeed();
        clearGpsAngle();
        clearGpsTime();
        clearGpsStat();
        clearTurnDir();
        clearTurnDist();
        clearDriverState();
        clearLocationRadius();
        clearHeight();
        clearAltitude();
        clearWalkingState();
        this.cachedSize = -1;
        return this;
    }

    public BhpsPointDelta clearAltitude() {
        this.hasAltitude = false;
        this.altitude_ = 0;
        return this;
    }

    public BhpsPointDelta clearDeltaLatitude() {
        this.hasDeltaLatitude = false;
        this.deltaLatitude_ = i.DOUBLE_EPSILON;
        return this;
    }

    public BhpsPointDelta clearDeltaLongitude() {
        this.hasDeltaLongitude = false;
        this.deltaLongitude_ = i.DOUBLE_EPSILON;
        return this;
    }

    public BhpsPointDelta clearDriverState() {
        this.hasDriverState = false;
        this.driverState_ = 0;
        return this;
    }

    public BhpsPointDelta clearGpsAngle() {
        this.hasGpsAngle = false;
        this.gpsAngle_ = i.DOUBLE_EPSILON;
        return this;
    }

    public BhpsPointDelta clearGpsSpeed() {
        this.hasGpsSpeed = false;
        this.gpsSpeed_ = i.DOUBLE_EPSILON;
        return this;
    }

    public BhpsPointDelta clearGpsStat() {
        this.hasGpsStat = false;
        this.gpsStat_ = 0;
        return this;
    }

    public BhpsPointDelta clearGpsTime() {
        this.hasGpsTime = false;
        this.gpsTime_ = 0L;
        return this;
    }

    public BhpsPointDelta clearHeight() {
        this.hasHeight = false;
        this.height_ = 0;
        return this;
    }

    public BhpsPointDelta clearLocationRadius() {
        this.hasLocationRadius = false;
        this.locationRadius_ = 0;
        return this;
    }

    public BhpsPointDelta clearTurnDir() {
        this.hasTurnDir = false;
        this.turnDir_ = 0;
        return this;
    }

    public BhpsPointDelta clearTurnDist() {
        this.hasTurnDist = false;
        this.turnDist_ = 0;
        return this;
    }

    public BhpsPointDelta clearWalkingState() {
        this.hasWalkingState = false;
        this.walkingState_ = 0;
        return this;
    }

    public int getAltitude() {
        return this.altitude_;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getCachedSize() {
        if (this.cachedSize < 0) {
            getSerializedSize();
        }
        return this.cachedSize;
    }

    public double getDeltaLatitude() {
        return this.deltaLatitude_;
    }

    public double getDeltaLongitude() {
        return this.deltaLongitude_;
    }

    public int getDriverState() {
        return this.driverState_;
    }

    public double getGpsAngle() {
        return this.gpsAngle_;
    }

    public double getGpsSpeed() {
        return this.gpsSpeed_;
    }

    public int getGpsStat() {
        return this.gpsStat_;
    }

    public long getGpsTime() {
        return this.gpsTime_;
    }

    public int getHeight() {
        return this.height_;
    }

    public int getLocationRadius() {
        return this.locationRadius_;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getSerializedSize() {
        int computeDoubleSize = hasDeltaLongitude() ? CodedOutputStreamMicro.computeDoubleSize(1, getDeltaLongitude()) : 0;
        if (hasDeltaLatitude()) {
            computeDoubleSize += CodedOutputStreamMicro.computeDoubleSize(2, getDeltaLatitude());
        }
        if (hasGpsSpeed()) {
            computeDoubleSize += CodedOutputStreamMicro.computeDoubleSize(3, getGpsSpeed());
        }
        if (hasGpsAngle()) {
            computeDoubleSize += CodedOutputStreamMicro.computeDoubleSize(4, getGpsAngle());
        }
        if (hasGpsTime()) {
            computeDoubleSize += CodedOutputStreamMicro.computeUInt64Size(5, getGpsTime());
        }
        if (hasGpsStat()) {
            computeDoubleSize += CodedOutputStreamMicro.computeUInt32Size(6, getGpsStat());
        }
        if (hasTurnDir()) {
            computeDoubleSize += CodedOutputStreamMicro.computeUInt32Size(7, getTurnDir());
        }
        if (hasTurnDist()) {
            computeDoubleSize += CodedOutputStreamMicro.computeUInt32Size(8, getTurnDist());
        }
        if (hasDriverState()) {
            computeDoubleSize += CodedOutputStreamMicro.computeUInt32Size(9, getDriverState());
        }
        if (hasLocationRadius()) {
            computeDoubleSize += CodedOutputStreamMicro.computeUInt32Size(10, getLocationRadius());
        }
        if (hasHeight()) {
            computeDoubleSize += CodedOutputStreamMicro.computeUInt32Size(11, getHeight());
        }
        if (hasAltitude()) {
            computeDoubleSize += CodedOutputStreamMicro.computeInt32Size(12, getAltitude());
        }
        if (hasWalkingState()) {
            computeDoubleSize += CodedOutputStreamMicro.computeInt32Size(13, getWalkingState());
        }
        this.cachedSize = computeDoubleSize;
        return computeDoubleSize;
    }

    public int getTurnDir() {
        return this.turnDir_;
    }

    public int getTurnDist() {
        return this.turnDist_;
    }

    public int getWalkingState() {
        return this.walkingState_;
    }

    public boolean hasAltitude() {
        return this.hasAltitude;
    }

    public boolean hasDeltaLatitude() {
        return this.hasDeltaLatitude;
    }

    public boolean hasDeltaLongitude() {
        return this.hasDeltaLongitude;
    }

    public boolean hasDriverState() {
        return this.hasDriverState;
    }

    public boolean hasGpsAngle() {
        return this.hasGpsAngle;
    }

    public boolean hasGpsSpeed() {
        return this.hasGpsSpeed;
    }

    public boolean hasGpsStat() {
        return this.hasGpsStat;
    }

    public boolean hasGpsTime() {
        return this.hasGpsTime;
    }

    public boolean hasHeight() {
        return this.hasHeight;
    }

    public boolean hasLocationRadius() {
        return this.hasLocationRadius;
    }

    public boolean hasTurnDir() {
        return this.hasTurnDir;
    }

    public boolean hasTurnDist() {
        return this.hasTurnDist;
    }

    public boolean hasWalkingState() {
        return this.hasWalkingState;
    }

    public final boolean isInitialized() {
        return this.hasDeltaLongitude && this.hasDeltaLatitude && this.hasGpsTime && this.hasGpsStat && this.hasHeight;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public BhpsPointDelta mergeFrom(CodedInputStreamMicro codedInputStreamMicro) {
        while (true) {
            int readTag = codedInputStreamMicro.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 9:
                    setDeltaLongitude(codedInputStreamMicro.readDouble());
                    break;
                case 17:
                    setDeltaLatitude(codedInputStreamMicro.readDouble());
                    break;
                case 25:
                    setGpsSpeed(codedInputStreamMicro.readDouble());
                    break;
                case 33:
                    setGpsAngle(codedInputStreamMicro.readDouble());
                    break;
                case 40:
                    setGpsTime(codedInputStreamMicro.readUInt64());
                    break;
                case 48:
                    setGpsStat(codedInputStreamMicro.readUInt32());
                    break;
                case 56:
                    setTurnDir(codedInputStreamMicro.readUInt32());
                    break;
                case 64:
                    setTurnDist(codedInputStreamMicro.readUInt32());
                    break;
                case 72:
                    setDriverState(codedInputStreamMicro.readUInt32());
                    break;
                case 80:
                    setLocationRadius(codedInputStreamMicro.readUInt32());
                    break;
                case 88:
                    setHeight(codedInputStreamMicro.readUInt32());
                    break;
                case 96:
                    setAltitude(codedInputStreamMicro.readInt32());
                    break;
                case 104:
                    setWalkingState(codedInputStreamMicro.readInt32());
                    break;
                default:
                    if (!parseUnknownField(codedInputStreamMicro, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public BhpsPointDelta setAltitude(int i8) {
        this.hasAltitude = true;
        this.altitude_ = i8;
        return this;
    }

    public BhpsPointDelta setDeltaLatitude(double d8) {
        this.hasDeltaLatitude = true;
        this.deltaLatitude_ = d8;
        return this;
    }

    public BhpsPointDelta setDeltaLongitude(double d8) {
        this.hasDeltaLongitude = true;
        this.deltaLongitude_ = d8;
        return this;
    }

    public BhpsPointDelta setDriverState(int i8) {
        this.hasDriverState = true;
        this.driverState_ = i8;
        return this;
    }

    public BhpsPointDelta setGpsAngle(double d8) {
        this.hasGpsAngle = true;
        this.gpsAngle_ = d8;
        return this;
    }

    public BhpsPointDelta setGpsSpeed(double d8) {
        this.hasGpsSpeed = true;
        this.gpsSpeed_ = d8;
        return this;
    }

    public BhpsPointDelta setGpsStat(int i8) {
        this.hasGpsStat = true;
        this.gpsStat_ = i8;
        return this;
    }

    public BhpsPointDelta setGpsTime(long j8) {
        this.hasGpsTime = true;
        this.gpsTime_ = j8;
        return this;
    }

    public BhpsPointDelta setHeight(int i8) {
        this.hasHeight = true;
        this.height_ = i8;
        return this;
    }

    public BhpsPointDelta setLocationRadius(int i8) {
        this.hasLocationRadius = true;
        this.locationRadius_ = i8;
        return this;
    }

    public BhpsPointDelta setTurnDir(int i8) {
        this.hasTurnDir = true;
        this.turnDir_ = i8;
        return this;
    }

    public BhpsPointDelta setTurnDist(int i8) {
        this.hasTurnDist = true;
        this.turnDist_ = i8;
        return this;
    }

    public BhpsPointDelta setWalkingState(int i8) {
        this.hasWalkingState = true;
        this.walkingState_ = i8;
        return this;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public void writeTo(CodedOutputStreamMicro codedOutputStreamMicro) {
        if (hasDeltaLongitude()) {
            codedOutputStreamMicro.writeDouble(1, getDeltaLongitude());
        }
        if (hasDeltaLatitude()) {
            codedOutputStreamMicro.writeDouble(2, getDeltaLatitude());
        }
        if (hasGpsSpeed()) {
            codedOutputStreamMicro.writeDouble(3, getGpsSpeed());
        }
        if (hasGpsAngle()) {
            codedOutputStreamMicro.writeDouble(4, getGpsAngle());
        }
        if (hasGpsTime()) {
            codedOutputStreamMicro.writeUInt64(5, getGpsTime());
        }
        if (hasGpsStat()) {
            codedOutputStreamMicro.writeUInt32(6, getGpsStat());
        }
        if (hasTurnDir()) {
            codedOutputStreamMicro.writeUInt32(7, getTurnDir());
        }
        if (hasTurnDist()) {
            codedOutputStreamMicro.writeUInt32(8, getTurnDist());
        }
        if (hasDriverState()) {
            codedOutputStreamMicro.writeUInt32(9, getDriverState());
        }
        if (hasLocationRadius()) {
            codedOutputStreamMicro.writeUInt32(10, getLocationRadius());
        }
        if (hasHeight()) {
            codedOutputStreamMicro.writeUInt32(11, getHeight());
        }
        if (hasAltitude()) {
            codedOutputStreamMicro.writeInt32(12, getAltitude());
        }
        if (hasWalkingState()) {
            codedOutputStreamMicro.writeInt32(13, getWalkingState());
        }
    }

    public static BhpsPointDelta parseFrom(byte[] bArr) {
        return (BhpsPointDelta) new BhpsPointDelta().mergeFrom(bArr);
    }
}
