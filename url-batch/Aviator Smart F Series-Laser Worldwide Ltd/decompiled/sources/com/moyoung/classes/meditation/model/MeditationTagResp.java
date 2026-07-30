package com.moyoung.classes.meditation.model;

import java.util.List;

/* loaded from: classes4.dex */
public class MeditationTagResp {
    private List<Course> course;
    private int id;
    private String name;
    private String picture;
    private int sequence;
    private int status;

    public class Course {
        private int duration;
        private int id;
        private String name;
        private int sequence;
        private int status;
        private String thumbnail;

        public Course() {
        }

        public int getDuration() {
            return this.duration;
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public int getSequence() {
            return this.sequence;
        }

        public int getStatus() {
            return this.status;
        }

        public String getThumbnail() {
            return this.thumbnail;
        }

        public void setDuration(int i8) {
            this.duration = i8;
        }

        public void setId(int i8) {
            this.id = i8;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setSequence(int i8) {
            this.sequence = i8;
        }

        public void setStatus(int i8) {
            this.status = i8;
        }

        public void setThumbnail(String str) {
            this.thumbnail = str;
        }
    }

    public List<Course> getCourseList() {
        return this.course;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getPicture() {
        return this.picture;
    }

    public int getSequence() {
        return this.sequence;
    }

    public int getStatus() {
        return this.status;
    }

    public void setCourse(List<Course> list) {
        this.course = list;
    }

    public void setId(int i8) {
        this.id = i8;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPicture(String str) {
        this.picture = str;
    }

    public void setSequence(int i8) {
        this.sequence = i8;
    }

    public void setStatus(int i8) {
        this.status = i8;
    }
}
